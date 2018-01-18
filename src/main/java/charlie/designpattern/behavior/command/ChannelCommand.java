package charlie.designpattern.behavior.command;

/**
 * Created by charlie on 18/01/2018.
 */
public class ChannelCommand implements Command {
    private final TV tv;
    private int channel;
    public ChannelCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.switchChannel(channel);
    }
}
