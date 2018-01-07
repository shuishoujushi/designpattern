package charlie.designpattern.creation.prototype;

/**
 * Created by charlie on 07/01/2018.
 */
public class AccessControl implements Prototype {
    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel, String access) {
        this.controlLevel = controlLevel;
        this.access = access;
    }

    public String getControlLevel() {
        return controlLevel;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public AccessControl clone() {
        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "controlLevel='" + controlLevel + '\'' +
                ", access='" + access + '\'' +
                '}';
    }
}
