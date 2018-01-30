package charlie.designpattern.behavior.vistor;

/**
 * Created by charlie on 30/01/2018.
 */
public interface Element {
    void accept(Visitor visitor);
}
