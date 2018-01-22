package charlie.designpattern.behavior.iterator;

import org.junit.Test;

import java.util.Iterator;

/**
 * Created by charlie on 22/01/2018.
 */
public class TestIteratorPattern {
    @Test
    public void testMethod() {
        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Rectangle");
        storage.addShape("Circle");
        storage.addShape("Square");

        Iterator<Shape> shapeIterator = new ShapeIterator(storage.getShapes());
        while (shapeIterator.hasNext()) {
            System.out.println(shapeIterator.next());
        }

        System.out.println("Apply removing while iteratoring...");
        shapeIterator = new ShapeIterator(storage.getShapes());
        while (shapeIterator.hasNext()) {
            System.out.println(shapeIterator.next());
            shapeIterator.remove();
        }
    }
}
