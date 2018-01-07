package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public abstract class AbstractParserFactory {
    public abstract XMLParser getParserInstance(String parserType);
}
