package charlie.designpattern.behavior.observer;

/**
 * Created by charlie on 17/01/2018.
 */
public class SMSUser implements Observer {
    private String userInfo;
    private String desc;
    private final Subject subject;

    public SMSUser(String userInfo, Subject subject) {
        if (null == userInfo) {
            throw new IllegalArgumentException("No publisher found.");
        }
        this.userInfo = userInfo;
        this.subject = subject;
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.getSubjectDetails() + "...");
        subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("UnSubscribing " + userInfo + " from " + subject.getSubjectDetails() + "...");
        subject.unSubscribeObserver(this);
        System.out.println("UnSubscribed successfully.");
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo +"]: " + desc);
    }
}
