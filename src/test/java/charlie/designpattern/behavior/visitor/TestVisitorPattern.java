package charlie.designpattern.behavior.visitor;

import charlie.designpattern.behavior.vistor.*;
import org.junit.Test;

/**
 * Created by charlie on 30/01/2018.
 */
public class TestVisitorPattern {
    @Test
    public void testMethod() {
        System.out.println("Before visitor...*********************");
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag bodyTag = new HtmlParentElement("<body>");
        bodyTag.setStartTag("<body>");
        bodyTag.setEndTag("</body>");

        parentTag.addChildTag(bodyTag);

        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        bodyTag.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        bodyTag.addChildTag(child1);

        parentTag.generateHtml();
        System.out.println("After vistor...************************");

        Visitor cssClass = new CssClassVistor();
        Visitor style = new StyleVisitor();

        parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        parentTag.accept(cssClass);
        parentTag.accept(style);

        bodyTag = new HtmlParentElement("<body>");
        bodyTag.setStartTag("<body>");
        bodyTag.setEndTag("</body>");
        bodyTag.accept(cssClass);
        bodyTag.accept(style);
        parentTag.addChildTag(bodyTag);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        child1.accept(cssClass);
        child1.accept(style);
        bodyTag.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        child1.accept(cssClass);
        child1.accept(style);
        bodyTag.addChildTag(child1);

        parentTag.generateHtml();
    }
}
