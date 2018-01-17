package charlie.designpattern.behavior.observer;

import java.util.List;

/**
 * Created by charlie on 17/01/2018.
 */
public class CommentaryObject implements Subject, Commentary {
    private final List<Observer> observers;
    private final String subjectDetails;
    private String desc;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer: observers) {
            observer.update(desc);
        }
    }

    @Override
    public String getSubjectDetails() {
        return this.subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }
}
