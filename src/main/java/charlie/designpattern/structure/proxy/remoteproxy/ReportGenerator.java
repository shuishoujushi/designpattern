package charlie.designpattern.structure.proxy.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by charlie on 10/01/2018.
 */
public interface ReportGenerator extends Remote{
    String generateDailyReport() throws RemoteException;
}
