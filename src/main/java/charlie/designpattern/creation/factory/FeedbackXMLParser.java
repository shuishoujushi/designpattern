package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class FeedbackXMLParser implements XMLParser {

    public String parse() {
        System.out.println("Parsing Feedback XML...");
        return "Feedback XML Message";
    }
}
