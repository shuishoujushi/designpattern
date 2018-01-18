package charlie.designpattern.behavior.command;

import org.junit.Test;

/**
 * Created by charlie on 18/01/2018.
 */
public class TestCommandPattern {
    @Test
    public void testMethod() {
        ThreadPool pool = new ThreadPool(1);
        TV tv = new TV(0);

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);
        Command channelCommand = new ChannelCommand(tv, 5);

        for (int i = 0; i < 5; i++) {
            pool.addCommand(turnOnCommand);
            pool.addCommand(turnOffCommand);
            pool.addCommand(channelCommand);
        }

//        pool.shutdownPool();
    }
}
