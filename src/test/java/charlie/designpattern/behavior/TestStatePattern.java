package charlie.designpattern.behavior;

import charlie.designpattern.behavior.state.Robot;
import org.junit.Test;

/**
 * Created by charlie on 25/01/2018.
 */
public class TestStatePattern {
    @Test
    public void testMethod() {
        Robot robot = new Robot();
        robot.cook();
        robot.walk();
        robot.off();
        robot.cook();
        robot.off();
        robot.walk();

    }
}
