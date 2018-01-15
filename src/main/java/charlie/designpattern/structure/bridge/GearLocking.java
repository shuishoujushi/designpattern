package charlie.designpattern.structure.bridge;

/**
 * Created by charlie on 15/01/2018.
 */
public class GearLocking implements Product {
    private final String name;

    public GearLocking(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void produce() {
        System.out.println("Produce GearLocking system.");
    }
}
