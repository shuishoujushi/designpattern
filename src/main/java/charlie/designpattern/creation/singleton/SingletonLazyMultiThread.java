package charlie.designpattern.creation.singleton;

/**
 * Created by charlie on 07/01/2018.
 */
public class SingletonLazyMultiThread {
    private static SingletonLazyMultiThread instance = null;

    private SingletonLazyMultiThread() {}

    public static synchronized SingletonLazyMultiThread getInstance() {
        if (null == instance) {
            return new SingletonLazyMultiThread();
        }
        return instance;
    }
}
