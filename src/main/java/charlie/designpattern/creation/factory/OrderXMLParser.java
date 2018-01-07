package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class OrderXMLParser implements XMLParser {

    public String parse() {
        System.out.println("Parsing Order XML...");
        return "Order XML Message";
    }
}
