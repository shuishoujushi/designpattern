package charlie.designpattern.structure.proxy.virtualproxy;

import java.util.List;

/**
 * Created by charlie on 10/01/2018.
 */
public class ContactProxyImpl implements ContactList {

    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (null == contactList) {
            System.out.println("Create ContactList and fetch list...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}
