package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class SimplyNonVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "SimplyNonVegPizza (200)";
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
