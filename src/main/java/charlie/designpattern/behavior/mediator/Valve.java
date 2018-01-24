package charlie.designpattern.behavior.mediator;

/**
 * Created by charlie on 24/01/2018.
 */
public class Valve implements Colleague {
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void open() {
        System.out.println("Valve is opened...");
        System.out.println("Filling water...");
        mediator.close();
    }

    public void close() {
        System.out.println("Valve is closed...");
        mediator.on();
    }
}
