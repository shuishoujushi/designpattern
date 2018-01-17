package charlie.designpattern.behavior.observer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by charlie on 17/01/2018.
 */
public class TestObserverPattern {
    @Test
    public void testMethod() {
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Match[2018Jan17]");
        Observer observer = new SMSUser("Charlie Wang", subject);
        observer.subscribe();
        System.out.println();

        Observer observer1 = new SMSUser("Lisa Li", subject);
        observer1.subscribe();
        System.out.println();

        Commentary commentary = (Commentary) subject;
        commentary.setDesc("Welcome to live soccer match.");
        commentary.setDesc("Current score is 0-0");
        System.out.println();

        observer1.unSubscribe();
        System.out.println();

        commentary.setDesc("It's a goal!");
        commentary.setDesc("Current score is 1-0");
        System.out.println();

        Observer observer2 = new SMSUser("Jingqin Wang", subject);
        observer2.subscribe();
        System.out.println();

        commentary.setDesc("It's another goal!");
        commentary.setDesc("Current score is 2-0");
    }
}
