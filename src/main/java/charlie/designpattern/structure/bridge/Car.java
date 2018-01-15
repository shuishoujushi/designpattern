package charlie.designpattern.structure.bridge;

/**
 * Created by charlie on 15/01/2018.
 */
public abstract class Car {
    private final Product product;
    private final String carType;

    protected Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    abstract void assemble();
    abstract void produceProduct();

    void printDetails() {
        System.out.println("Car: " + carType + ", name" + product.getName());
    }
}
