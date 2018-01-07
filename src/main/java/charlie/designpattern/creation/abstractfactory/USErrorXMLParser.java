package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class USErrorXMLParser implements XMLParser {
    public String parse() {
        System.out.println("Parsing US Error XML...");
        return "US Error XML Msg";
    }
}
