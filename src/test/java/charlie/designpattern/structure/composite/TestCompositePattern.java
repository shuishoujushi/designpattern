package charlie.designpattern.structure.composite;

import org.junit.Test;

/**
 * Created by charlie on 11/01/2018.
 */
public class TestCompositePattern {

    @Test
    public void testMethod() {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTagName("<html>");
        parentTag.setEndTagName("</html>");

        HtmlTag bodyTag = new HtmlParentElement("<body>");
        bodyTag.setStartTagName("<body>");
        bodyTag.setEndTagName("</body>");

        parentTag.addChild(bodyTag);

        HtmlTag pTag = new HtmlElement("<p>");
        pTag.setStartTagName("<p>");
        pTag.setEndTagName("</p>");
        pTag.setTagBody("We should obey the rule.");
        bodyTag.addChild(pTag);

        pTag = new HtmlElement("<p>");
        pTag.setStartTagName("<p>");
        pTag.setEndTagName("</p>");
        pTag.setTagBody("No one is expection.");
        bodyTag.addChild(pTag);

        parentTag.generateHtml();
    }
}
