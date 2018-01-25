package charlie.designpattern.behavior.state;

/**
 * Created by charlie on 25/01/2018.
 */
public class RoboticCook implements RoboticState {
    private final Robot robot;

    public RoboticCook(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("Cannot switch off while cooking...");
    }
}
