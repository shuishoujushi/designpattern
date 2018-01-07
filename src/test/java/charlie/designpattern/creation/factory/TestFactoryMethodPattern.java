package charlie.designpattern.creation.factory;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by charlie on 07/01/2018.
 */
public class TestFactoryMethodPattern {

    private DisplayService displayService = null;

    @Before
    public void setUp() {
        displayService = new ErrorXMLDisplayService();
    }

    @Test
    public void testMethod() {
        displayService.display();

        displayService = new FeedbackXMLDisplayService();
        displayService.display();

        displayService = new OrderXMLDisplayService();
        displayService.display();

        displayService = new ResponseXMLDisplayService();
        displayService.display();
    }
}
