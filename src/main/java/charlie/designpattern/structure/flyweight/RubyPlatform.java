package charlie.designpattern.structure.flyweight;

/**
 * Created by charlie on 15/01/2018.
 */
public class RubyPlatform implements Platform {
    public RubyPlatform() {
        System.out.println("RubyPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Ruby code.");
    }
}
