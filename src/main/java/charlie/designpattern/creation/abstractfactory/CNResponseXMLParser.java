package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class CNResponseXMLParser implements XMLParser {
    public String parse() {
        System.out.println("Parsing CN Response XML");
        return "CN Response XML Message";
    }
}
