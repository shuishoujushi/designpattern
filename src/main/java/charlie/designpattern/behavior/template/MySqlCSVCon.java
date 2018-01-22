package charlie.designpattern.behavior.template;

/**
 * Created by charlie on 22/01/2018.
 */
public class MySqlCSVCon extends ConnectionTemplate {
    @Override
    protected void setDBDriver() {
        System.out.println("MySqlCSVCon setDBDriver");
    }

    @Override
    protected void setCredentials() {
        System.out.println("MySqlCSVCon setCredentials");
    }

    @Override
    protected void setData() {
        System.out.println("MySqlCSVCon setData");
    }

    @Override
    public boolean disableLogging() {
        return false;
    }
}
