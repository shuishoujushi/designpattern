package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class USOrderXMLParser implements XMLParser {
    public String parse() {
        System.out.println("Parsing US Order XML...");
        return "US Order XML Msg";
    }
}
