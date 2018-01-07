package charlie.designpattern.creation.singleton;

/**
 * Created by charlie on 07/01/2018.
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
