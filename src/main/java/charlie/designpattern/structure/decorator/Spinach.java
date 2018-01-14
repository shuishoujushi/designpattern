package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class Spinach extends PizzaDecorator {
    private final Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Spinach (4.92)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 4.92;
    }
}
