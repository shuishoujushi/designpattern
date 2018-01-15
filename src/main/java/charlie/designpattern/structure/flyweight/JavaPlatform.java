package charlie.designpattern.structure.flyweight;

/**
 * Created by charlie on 15/01/2018.
 */
public class JavaPlatform implements Platform {
    public JavaPlatform() {
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing java code.");
    }
}
