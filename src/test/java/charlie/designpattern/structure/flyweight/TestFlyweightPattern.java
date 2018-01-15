package charlie.designpattern.structure.flyweight;

import org.junit.Test;

/**
 * Created by charlie on 15/01/2018.
 */
public class TestFlyweightPattern {
    @Test
    public void testMethod() {
        Code code = new Code();
        code.setCode("Java Code...");
        Platform platform = PlatformFactory.getPlatform("JAVA");
        platform.execute(code);

        code.setCode("Java Code 2...");
        platform = PlatformFactory.getPlatform("JAVA");
        platform.execute(code);

        code.setCode("C++ Code...");
        platform = PlatformFactory.getPlatform("C++");
        platform.execute(code);


    }
}
