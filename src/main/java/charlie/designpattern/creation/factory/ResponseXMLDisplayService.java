package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class ResponseXMLDisplayService extends DisplayService {
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
