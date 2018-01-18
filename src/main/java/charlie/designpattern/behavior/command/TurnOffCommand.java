package charlie.designpattern.behavior.command;

/**
 * Created by charlie on 18/01/2018.
 */
public class TurnOffCommand implements Command {
    private final TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
