package charlie.designpattern.structure.flyweight;

/**
 * Created by charlie on 15/01/2018.
 */
public class CPPPlatform implements Platform {
    public CPPPlatform() {
        System.out.println("CPPPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing CPP code.");
    }
}
