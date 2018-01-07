package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class CNErrorXMLParser implements XMLParser {
    public String parse() {
        System.out.println("Parsing CN error XML...");
        return "CN ERROR XML Message";
    }
}
