package charlie.designpattern.behavior.cor;

/**
 * Created by charlie on 24/01/2018.
 */
public class TextFileHandler implements Handler {
    private Handler handler;
    private String handlerName;

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(MyFile file) {
        if ("text".equals(file.getFileType())) {
            System.out.println("Process and save text file by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("File not supported.");
        }
    }

    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}
