package charlie.designpattern.behavior.strategy;

import org.junit.Test;

/**
 * Created by charlie on 17/01/2018.
 */
public class TestStrategyPattern {
    @Test
    public void testMethod() {
        TextFormatter capFormatter = new CapTextFormatter();
        TextEditor textEditor = new TextEditor(capFormatter);
        textEditor.publishText("Love design pattern.");

        TextFormatter lowFormatter = new LowerTextFormatter();
        textEditor = new TextEditor(lowFormatter);
        textEditor.publishText("Design pattern is an awesome methodology.");
    }
}
