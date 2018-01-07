package charlie.designpattern.creation.singleton;

/**
 * Created by charlie on 07/01/2018.
 */

/**
 * Lazy singleton has issue in multi-thread environment
 */
public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (null == instance) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
