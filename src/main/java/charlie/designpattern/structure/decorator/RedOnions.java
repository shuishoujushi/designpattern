package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class RedOnions extends PizzaDecorator {
    private final Pizza pizza;

    public RedOnions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", RedOnions (3.75)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.75;
    }
}
