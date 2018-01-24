package charlie.designpattern.behavior.mediator;

/**
 * Created by charlie on 24/01/2018.
 */
public class Machine implements Colleague {
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void start() {
        mediator.open();
    }

    public void wash() {
        mediator.wash();
    }
}
