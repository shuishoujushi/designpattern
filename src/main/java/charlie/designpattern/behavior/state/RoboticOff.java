package charlie.designpattern.behavior.state;

/**
 * Created by charlie on 25/01/2018.
 */
public class RoboticOff implements RoboticState {
    private final Robot robot;

    public RoboticOff(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        robot.setRoboticState(robot.getRoboticOn());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cannot cook at Off state.");
    }

    @Override
    public void off() {
        System.out.println("Already switched off..");
    }
}
