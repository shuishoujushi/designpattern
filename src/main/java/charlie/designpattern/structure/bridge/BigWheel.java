package charlie.designpattern.structure.bridge;

/**
 * Created by charlie on 15/01/2018.
 */
public class BigWheel extends Car {
    private final Product product;
    private final String carType;

    protected BigWheel(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    void assemble() {
        System.out.println("Assembling " + product.getName() + " for " + carType);
    }

    @Override
    void produceProduct() {
        product.produce();
        System.out.println("Modifying " + product.getName() + " according to " + carType);
    }
}
