package charlie.designpattern.behavior.vistor;

/**
 * Created by charlie on 30/01/2018.
 */
public interface Visitor {
    void visit(HtmlElement element);
    void visit(HtmlParentElement parentElement);
}
