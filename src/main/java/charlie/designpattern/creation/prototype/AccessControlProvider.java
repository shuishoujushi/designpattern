package charlie.designpattern.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by charlie on 07/01/2018.
 */
public class AccessControlProvider {
    private static Map<String, AccessControl> map = new HashMap<>();

    static {
        System.out.println("Fetching data from external resources and creating accessControl objects");
        map.put("USER", new AccessControl("USER", "DO_WORK"));
        map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
        map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"));
        map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
    }

    public static AccessControl getAccessControlObject(String controlLevel) {
        AccessControl ac = map.get(controlLevel);
        if (null != ac) {
            return ac.clone();
        }
        return null;
    }
}
