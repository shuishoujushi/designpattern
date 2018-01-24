package charlie.designpattern.behavior.cor;

/**
 * Created by charlie on 24/01/2018.
 */
public class ExcelFileHandler implements Handler {
    private String handlerName;
    private Handler handler;

    public ExcelFileHandler(String hanlderName) {
        this.handlerName = hanlderName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(MyFile file) {
        if ("excel".equals(file.getFileType())) {
            System.out.println("Process and save excel file by " + handlerName);
        } else if (null != handler) {
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
