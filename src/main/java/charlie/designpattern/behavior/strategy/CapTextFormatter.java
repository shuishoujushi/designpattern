package charlie.designpattern.behavior.strategy;

/**
 * Created by charlie on 17/01/2018.
 */
public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("CapTextFormatter format result: " + text.toUpperCase());
    }
}
