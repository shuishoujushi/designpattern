package charlie.designpattern.behavior.state;

/**
 * Created by charlie on 25/01/2018.
 */
public class RoboticOn implements RoboticState {
    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        robot.setRoboticState(robot.getRoboticCook());
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
