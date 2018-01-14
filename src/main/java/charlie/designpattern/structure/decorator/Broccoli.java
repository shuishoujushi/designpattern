package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class Broccoli extends PizzaDecorator {

    private final Pizza pizza;

    public Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Broccoli (9.25)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 9.25;
    }
}
