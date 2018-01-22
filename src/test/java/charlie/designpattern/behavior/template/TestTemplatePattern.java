package charlie.designpattern.behavior.template;

import org.junit.Test;

/**
 * Created by charlie on 22/01/2018.
 */
public class TestTemplatePattern {
    @Test
    public void testMethod() {
        System.out.println("----------------MysqlCSVCon-----------------");
        ConnectionTemplate template = new MySqlCSVCon();
        template.run();

        System.out.println();
        System.out.println("----------------OracleTxtCon----------------");
        template = new OracleTxtCon();
        template.run();
    }
}
