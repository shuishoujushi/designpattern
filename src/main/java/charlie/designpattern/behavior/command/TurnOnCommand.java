package charlie.designpattern.behavior.command;

/**
 * Created by charlie on 18/01/2018.
 */
public class TurnOnCommand implements Command {
    private final TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
