package charlie.designpattern.behavior.vistor;

/**
 * Created by charlie on 30/01/2018.
 */
public class CssClassVistor implements Visitor {
    @Override
    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " class='visitor'>"));
    }

    @Override
    public void visit(HtmlParentElement parentElement) {
        parentElement.setStartTag(parentElement.getStartTag().replace(">", " class='visitor'>"));
    }
}
