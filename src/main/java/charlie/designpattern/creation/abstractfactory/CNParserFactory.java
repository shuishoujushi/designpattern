package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public class CNParserFactory extends AbstractParserFactory {
    public XMLParser getParserInstance(String parserType) {
        switch (parserType) {
            case "CNERROR": return new CNErrorXMLParser();
            case "CNORDER": return new CNOrderXMLParser();
            case "CNRESPONSE": return new CNResponseXMLParser();
        }
        return null;
    }
}
