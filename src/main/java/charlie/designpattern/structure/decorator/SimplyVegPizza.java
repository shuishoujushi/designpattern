package charlie.designpattern.structure.decorator;

/**
 * Created by charlie on 14/01/2018.
 */
public class SimplyVegPizza implements Pizza {
    @Override
    public String getDesc() {
        return "SimplyVegPizza (100)";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}
