package charlie.designpattern.structure.proxy;

import charlie.designpattern.structure.proxy.virtualproxy.Company;
import charlie.designpattern.structure.proxy.virtualproxy.ContactList;
import charlie.designpattern.structure.proxy.virtualproxy.ContactProxyImpl;
import charlie.designpattern.structure.proxy.virtualproxy.Employee;
import org.junit.Test;

/**
 * Created by charlie on 10/01/2018.
 */
public class TestVirtualProxy {

    @Test
    public void testMethod() {
        ContactList contactList = new ContactProxyImpl();
        Company company = new Company("ABC Tech", "Xi'an", "710000", contactList);
        System.out.println(company);

        contactList = company.getContactList();
        for (Employee emp : contactList.getEmployeeList()) {
            System.out.println(emp);
        }
    }
}
