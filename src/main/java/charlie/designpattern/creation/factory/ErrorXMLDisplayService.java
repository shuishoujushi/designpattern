package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class ErrorXMLDisplayService extends DisplayService {
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
