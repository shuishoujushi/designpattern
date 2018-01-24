package charlie.designpattern.behavior.mediator;

/**
 * Created by charlie on 24/01/2018.
 */
public class Motor {
    public void startMotor() {
        System.out.println("Motor is started.");
    }

    public void rotateDrum(int drumNumber) {
        System.out.println("Setting rotate drum to " + drumNumber);
    }
}
