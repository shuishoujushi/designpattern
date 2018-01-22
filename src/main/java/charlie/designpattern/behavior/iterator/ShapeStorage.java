package charlie.designpattern.behavior.iterator;

/**
 * Created by charlie on 22/01/2018.
 */
public class ShapeStorage {
    private Shape[] shapes = new Shape[5];
    private int index;

    public void addShape(String name) {
        int i = index++;
        shapes[i] = new Shape(i, name);
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
