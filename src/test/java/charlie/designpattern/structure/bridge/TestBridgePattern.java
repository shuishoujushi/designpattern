package charlie.designpattern.structure.bridge;

import org.junit.Test;

/**
 * Created by charlie on 15/01/2018.
 */
public class TestBridgePattern {
    @Test
    public void testMethod() {
        Product product1 = new CentralLocking("CentralLocking");
        Product product2 = new GearLocking("GearLocking");

        Car car1 = new BigWheel(product1, "BigWheel xz Model");
        car1.assemble();
        car1.produceProduct();
        car1.printDetails();
        System.out.println("--------------------");

        car1 = new BigWheel(product2, "BigWheel ab Model");
        car1.assemble();
        car1.produceProduct();
        car1.printDetails();
        System.out.println("--------------------");

        Car car2 = new Motoren(product2, "Motoren benz X2");
        car2.assemble();
        car2.produceProduct();
        car2.printDetails();
        System.out.println("--------------------");

        car2 = new Motoren(product1, "Motoren benz X1");
        car2.assemble();
        car2.produceProduct();
        car2.printDetails();
        System.out.println("--------------------");
    }
}
