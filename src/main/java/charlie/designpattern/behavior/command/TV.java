package charlie.designpattern.behavior.command;

/**
 * Created by charlie on 18/01/2018.
 */
public class TV {
    private int channel;

    public TV(int channel) {
        this.channel = channel;
    }

    public void turnOn() {
        System.out.println("Turn on TV...");
    }

    public void turnOff() {
        System.out.println("Turn off TV...");
    }

    public void switchChannel(int channel) {
        setChannel(channel);
        System.out.println("TV channel has switched to " + channel);
    }

    private void setChannel(int channel) {
        this.channel = channel;
    }
}
