package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class USParserFactory extends AbstractParserFactory {
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "USERROR": return new USErrorXMLParser();
            case "USORDER": return new USOrderXMLParser();
            case "USRESPONSE": return new USResponseXMLParser();
        }
        return null;
    }
}
