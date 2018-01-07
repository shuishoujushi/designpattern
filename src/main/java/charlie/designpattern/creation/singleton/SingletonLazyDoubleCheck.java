package charlie.designpattern.creation.singleton;

/**
 * Created by charlie on 07/01/2018.
 */
public class SingletonLazyDoubleCheck {
    private static SingletonLazyDoubleCheck instance = null;

    private SingletonLazyDoubleCheck() {}

    public static synchronized SingletonLazyDoubleCheck getInstance() {
        if (null == instance) {
            synchronized (SingletonLazyDoubleCheck.class) {
                return new SingletonLazyDoubleCheck();
            }
        }
        return instance;
    }
}
