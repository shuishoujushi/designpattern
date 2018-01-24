package charlie.designpattern.behavior.mediator;

/**
 * Created by charlie on 24/01/2018.
 */
public interface MachineMediator {
    void start();
    void wash();
    void open();
    void close();
    void on();
    void off();
    boolean checkTemperature(int temp);
}
