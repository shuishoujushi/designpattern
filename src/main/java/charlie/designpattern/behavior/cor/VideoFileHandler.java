package charlie.designpattern.behavior.cor;

/**
 * Created by charlie on 24/01/2018.
 */
public class VideoFileHandler implements Handler {
    private String handlerName;
    private Handler handler;

    public VideoFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(MyFile file) {
        if ("video".equals(file.getFileType())) {
            System.out.println("Process and save video file by " + handlerName);
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
