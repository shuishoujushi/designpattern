package charlie.designpattern.behavior.state;

/**
 * Created by charlie on 25/01/2018.
 */
public class Robot implements RoboticState {
    private RoboticState state;
    private RoboticOn roboticOn;
    private RoboticOff roboticOff;
    private RoboticCook roboticCook;

    public Robot() {
        this.roboticOn = new RoboticOn(this);
        this.roboticOff = new RoboticOff(this);
        this.roboticCook = new RoboticCook(this);

        this.state = roboticOn;
    }

    @Override
    public void walk() {
        state.walk();
    }

    @Override
    public void cook() {
        state.cook();
    }

    @Override
    public void off() {
        state.off();
    }

    public void setRoboticState(RoboticState state) {
        this.state = state;
    }

    public RoboticState getState() {
        return state;
    }

    public void setState(RoboticState state) {
        this.state = state;
    }

    public RoboticOn getRoboticOn() {
        return roboticOn;
    }

    public void setRoboticOn(RoboticOn roboticOn) {
        this.roboticOn = roboticOn;
    }

    public RoboticOff getRoboticOff() {
        return roboticOff;
    }

    public void setRoboticOff(RoboticOff roboticOff) {
        this.roboticOff = roboticOff;
    }

    public RoboticCook getRoboticCook() {
        return roboticCook;
    }

    public void setRoboticCook(RoboticCook roboticCook) {
        this.roboticCook = roboticCook;
    }
}
