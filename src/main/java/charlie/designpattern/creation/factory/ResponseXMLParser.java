package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class ResponseXMLParser implements XMLParser {

    public String parse() {
        System.out.println("Parsing Response XML...");
        return "Response XML Message";
    }
}
