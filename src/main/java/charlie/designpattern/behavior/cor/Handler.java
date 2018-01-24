package charlie.designpattern.behavior.cor;

/**
 * Created by charlie on 24/01/2018.
 */
public interface Handler {
    void setHandler(Handler handler);
    void process(MyFile file);
    String getHandlerName();
}
