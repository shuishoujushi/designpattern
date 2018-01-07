package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class CNOrderXMLParser implements XMLParser {
    public String parse() {
        System.out.println("Parsing CN Order XML...");
        return "CN Order XML Message";
    }
}
