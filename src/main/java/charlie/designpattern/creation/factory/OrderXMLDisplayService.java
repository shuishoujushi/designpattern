package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public class OrderXMLDisplayService extends DisplayService {
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
