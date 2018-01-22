package charlie.designpattern.behavior.template;

/**
 * Created by charlie on 22/01/2018.
 */
public class OracleTxtCon extends ConnectionTemplate {
    @Override
    protected void setDBDriver() {
        System.out.println("OracleTxtCon setDBDriver");
    }

    @Override
    protected void setCredentials() {
        System.out.println("OracleTxtCon setCredentials");
    }

    @Override
    protected void setData() {
        System.out.println("OracleTxtCon setData");
    }
}
