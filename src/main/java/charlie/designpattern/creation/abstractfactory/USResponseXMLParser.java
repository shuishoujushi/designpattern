package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class USResponseXMLParser implements XMLParser {
    public String parse() {
        System.out.println("Parsing US Response XML...");
        return "US Response XML Msg";
    }
}
