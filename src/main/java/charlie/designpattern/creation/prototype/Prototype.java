package charlie.designpattern.creation.prototype;

/**
 * Created by charlie on 07/01/2018.
 */
public interface Prototype extends Cloneable {

    AccessControl clone();
}
