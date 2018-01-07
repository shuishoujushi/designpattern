package charlie.designpattern.creation.factory;

/**
 * Created by charlie on 07/01/2018.
 */
public abstract class DisplayService {

    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
