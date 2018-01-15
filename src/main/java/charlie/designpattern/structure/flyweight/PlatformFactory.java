package charlie.designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by charlie on 15/01/2018.
 */
public final class PlatformFactory {
    static Map<String, Platform> map = new HashMap<>();

    private PlatformFactory() {
        throw new AssertionError("Can't instantiate the class");
    }

    public static synchronized Platform getPlatform(String platformType) {
        Platform platform = map.get(platformType);
        if (null == platform) {
            switch (platformType) {
                case "C":
                    platform = new CPlatform();
                    break;
                case "JAVA":
                    platform = new JavaPlatform();
                    break;
                case "C++":
                    platform = new CPPPlatform();
                    break;
                case "Ruby":
                    platform = new RubyPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }
}
