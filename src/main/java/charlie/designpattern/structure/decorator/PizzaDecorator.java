package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public abstract class PizzaDecorator implements Pizza {
    @Override
    public String getDesc() {
        return "Toppings";
    }
}
