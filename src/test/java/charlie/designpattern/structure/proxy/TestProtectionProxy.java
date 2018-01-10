package charlie.designpattern.structure.proxy;

import charlie.designpattern.structure.proxy.protectionproxy.*;
import charlie.designpattern.structure.proxy.protectionproxy.Employee;
import org.junit.Test;

/**
 * Created by charlie on 10/01/2018.
 */
public class TestProtectionProxy {

    @Test
    public void testMethod() {
        Owner owner = new Owner();
        ReportGeneratorProxy reportGeneratorProxy = new ReportGeneratorProtectionProxy(owner);
        owner.setReportGenerator(reportGeneratorProxy);

        charlie.designpattern.structure.proxy.protectionproxy.Employee employee = new Employee();
        reportGeneratorProxy = new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGeneratorProxy);

        System.out.println("For owner: " + owner.generateDailyReport());
        System.out.println("For employee: " + employee.generateDailyReport());
    }
}
