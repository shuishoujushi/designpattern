package charlie.designpattern.behavior.template;

import java.util.Date;

/**
 * Created by charlie on 22/01/2018.
 */
public abstract class ConnectionTemplate {

    private boolean isLoggingEnable = true;

    public ConnectionTemplate() {
        this.isLoggingEnable = disableLogging();
    }

    public boolean disableLogging() {
        return true;
    }

    public final void run() {
        setDBDriver();
        logging("DBDriver set [" + new Date() + "]");
        setCredentials();
        logging("Credentials set [" + new Date() + "]");
        connect();
        logging("Connecting [" + new Date() + "]");
        prepareStatement();
        logging("Prepare statement [" + new Date() + "]");
        setData();
        logging("Data set [" + new Date() + "]");
        insert();
        logging("Insert data [" + new Date() + "]");
        close();
        logging("Close [" + new Date() + "]");
        destroy();
        logging("Destory [" + new Date() + "]");
    }

    protected abstract void setDBDriver();

    protected abstract void setCredentials();

    protected abstract void setData();

    public void connect() {
        System.out.println("connect");
    }

    public void prepareStatement() {
        System.out.println("prepareStatement");
    }

    public void insert() {
        System.out.println("insert");
    }

    public void close() {
        System.out.println("close");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    private void logging(String msg) {
        if (isLoggingEnable) {
            System.out.println("Logging...: " + msg);
        }
    }
}
