package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class RomaTomatoes extends PizzaDecorator {
    private final Pizza pizza;

    public RomaTomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", RomaTomatoes (5.20)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.20;
    }
}
