package charlie.designpattern.behavior.observer;

/**
 * Created by charlie on 17/01/2018.
 */
public interface Observer {
    void subscribe();
    void unSubscribe();
    void update(String desc);
}
