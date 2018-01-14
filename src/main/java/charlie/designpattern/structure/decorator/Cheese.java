package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class Cheese extends PizzaDecorator {
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese (20.72)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.72;
    }
}
