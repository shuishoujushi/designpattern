package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class FeedbackXMLDisplayService extends DisplayService {
    protected XMLParser getParser() {
        return new FeedbackXMLParser();
    }
}
