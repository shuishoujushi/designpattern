package charlie.designpattern.behavior.command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by charlie on 18/01/2018.
 */
public class ThreadPool {
    private final BlockingQueue<Command> commandQueue;
    private final Thread[] commandThreads;
    private volatile boolean shutdown;

    public ThreadPool(int n) {
        commandQueue = new LinkedBlockingQueue<>();
        commandThreads = new Thread[n];

        for (int i = 0; i < n; i++) {
            commandThreads[i] = new Button("Pool Thread " + i);
            System.out.println(commandThreads[i].getId() + ", " + commandThreads[i].getName());
            commandThreads[i].start();
        }
    }

    public void addCommand(Command command) {
        try {
            commandQueue.put(command);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdownPool() {
        while (!commandQueue.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        shutdown = true;
        for (Thread commandThread : commandThreads) {
            commandThread.interrupt();
        }
    }

    private class Button extends Thread {
        public Button(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!shutdown) {
                try {
                    Command c = commandQueue.take();
                    c.execute();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
