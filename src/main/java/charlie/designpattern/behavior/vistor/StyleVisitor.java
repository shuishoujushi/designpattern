package charlie.designpattern.behavior.vistor;

/**
 * Created by charlie on 30/01/2018.
 */
public class StyleVisitor implements Visitor {
    @Override
    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " style='width:46px;'>"));
    }

    @Override
    public void visit(HtmlParentElement parentElement) {
        parentElement.setStartTag(parentElement.getStartTag().replace(">", " style='width:58px'>"));
    }
}
