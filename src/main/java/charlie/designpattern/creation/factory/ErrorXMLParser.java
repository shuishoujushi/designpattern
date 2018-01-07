package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class ErrorXMLParser implements XMLParser {

    public String parse() {
        System.out.println("Parsing Error XML...");
        return "Error XML Message";
    }
}
