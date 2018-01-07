package charlie.designpattern.creation.abstractfactory;

import org.junit.Test;

/**
 * Created by charlie on 07/01/2018.
 */
public class TestAbstractFactoryPattern {

    @Test
    public void testMethod() {
        AbstractParserFactory factory = ParserFactoryProducer.getFactory("CNFactory");
        XMLParser parser = factory.getParserInstance("CNORDER");
        String msg = parser.parse();
        System.out.println(msg);

        System.out.println("********************************");
        factory = ParserFactoryProducer.getFactory("USFactory");
        parser = factory.getParserInstance("USRESPONSE");
        msg = parser.parse();
        System.out.println(msg);
    }
}
