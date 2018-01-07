package charlie.designpattern.creation.singleton;

import java.io.Serializable;

/**
 * Created by charlie on 07/01/2018.
 */
public class Singleton implements Serializable {

    private static Singleton sc = new Singleton();

    private Singleton() {
        if (null != sc) {
            throw new IllegalStateException("Already Created!");
        }
    }

    public static Singleton getInstance(){
        return sc;
    }

    private Object readResolve() {
        return sc;
    }

    private Object writeReplace() {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, can't be cloned.");
    }

    private static Class getClass(String className) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (null == classLoader) {
            classLoader = Singleton.class.getClassLoader();
        }
        return classLoader.loadClass(className);
    }
}
