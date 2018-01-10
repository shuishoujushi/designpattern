package charlie.designpattern.structure.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlie on 10/01/2018.
 */
public class ContactListImpl implements ContactList {

    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    private static List<Employee> getEmpList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Employee A", 10000, "SE"));
        employeeList.add(new Employee("Employee B", 12000, "SSE"));
        employeeList.add(new Employee("Employee C", 13000, "SSE"));
        employeeList.add(new Employee("Employee D", 14000, "SSE"));
        employeeList.add(new Employee("Employee E", 15000, "Manager"));
        return employeeList;
    }
}
