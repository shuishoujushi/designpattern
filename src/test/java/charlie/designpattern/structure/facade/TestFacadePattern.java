package charlie.designpattern.structure.facade;

import org.junit.Test;

/**
 * Created by charlie on 10/01/2018.
 */
public class TestFacadePattern {
    @Test
    public void testMethod() {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facade = new ScheduleServerFacade(scheduleServer);

        facade.startServer();
        System.out.println("Start working....");

        System.out.println("After working...");
        facade.stopServer();
    }
}
