package charlie.designpattern.structure.decorator;

import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Created by charlie on 14/01/2018.
 */
public class TestDecoratorPattern {
    @Test
    public void testMethod() {
        Pizza pizza = new SimplyVegPizza();
        DecimalFormat df = new DecimalFormat("#.###");

        pizza = new RomaTomatoes(pizza);
        pizza = new GreenOlives(pizza);
        pizza = new Spinach(pizza);
        System.out.println("SimplyVegPizza Desc: " + pizza.getDesc());
        System.out.println("SimplyVegPizza Price: " + df.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();
        pizza = new Meat(pizza);
        pizza = new Cheese(pizza);
        pizza = new Chicken(pizza);
        pizza = new Ham(pizza);
        System.out.println("SimplyNonVegPizza Desc: " + pizza.getDesc());
        System.out.println("SimplyNonVegPizza Price: " + df.format(pizza.getPrice()));
    }
}
