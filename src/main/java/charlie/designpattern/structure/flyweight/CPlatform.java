package charlie.designpattern.structure.flyweight;

/**
 * Created by charlie on 15/01/2018.
 */
public class CPlatform implements Platform {
    public CPlatform() {
        System.out.println("CPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing C code.");
    }
}
