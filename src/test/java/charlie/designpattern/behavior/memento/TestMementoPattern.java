package charlie.designpattern.behavior.memento;

import org.junit.Test;

/**
 * Created by charlie on 25/01/2018.
 */
public class TestMementoPattern {
    @Test
    public void testMethod() {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(0, 1, careTaker);
        System.out.println("Default state: " + originator);

        originator.setX(11.11 + originator.getX());
        originator.setX(12.12 * originator.getY());
        System.out.println("State: " + originator);
        originator.createSavepoint("Save1");

        originator.setX(Math.pow(originator.getX(), 3));
        originator.setY(originator.getY() / 12);
        System.out.println("State: " + originator);
        originator.createSavepoint("Save2");

        originator.undo("Save1");
        System.out.println("Undo state: " + originator);

        originator.undoAll();
        System.out.println("UndoAll state: " + originator);
    }
}
