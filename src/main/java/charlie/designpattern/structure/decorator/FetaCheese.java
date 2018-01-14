package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class FetaCheese extends PizzaDecorator {
    private final Pizza pizza;

    public FetaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", FetaCheese (25.88)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 25.88;
    }
}
