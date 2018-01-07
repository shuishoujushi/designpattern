package charlie.designpattern.creation.abstractfactory;

/**
 * Created by charlie on 07/01/2018.
 */
public final class ParserFactoryProducer {
    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "CNFactory": return new CNParserFactory();
            case "USFactory": return new USParserFactory();
        }
        return null;
    }
}
