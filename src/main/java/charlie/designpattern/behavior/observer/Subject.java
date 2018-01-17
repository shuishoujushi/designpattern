package charlie.designpattern.behavior.observer;

/**
 * Created by charlie on 17/01/2018.
 */
public interface Subject {
    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String getSubjectDetails();
}
