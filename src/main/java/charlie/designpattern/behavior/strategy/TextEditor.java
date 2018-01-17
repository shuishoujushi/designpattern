package charlie.designpattern.behavior.strategy;

/**
 * Created by charlie on 17/01/2018.
 */
public class TextEditor {
    private final TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text) {
        formatter.format(text);
    }
}
