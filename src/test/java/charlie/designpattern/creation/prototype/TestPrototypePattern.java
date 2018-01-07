package charlie.designpattern.creation.prototype;

import org.junit.Test;

/**
 * Created by charlie on 07/01/2018.
 */
public class TestPrototypePattern {

    @Test
    public void testMethod() {
        AccessControl accessControl = AccessControlProvider.getAccessControlObject("USER");
        User user = new User("User A", "User Level", accessControl);
        System.out.println(user);
        System.out.println("*************************************************");

        accessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("User B", "User Level", accessControl);
        System.out.println("Changing access control of: " + user.getUserName());
        user.getAccessControl().setAccess("READ REPORTS");
        System.out.println(user);
        System.out.println("*************************************************");

        accessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "Manager Level", accessControl);
        System.out.println(user);
        System.out.println("*************************************************");
    }
}
