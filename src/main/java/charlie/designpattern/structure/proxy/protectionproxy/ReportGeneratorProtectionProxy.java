package charlie.designpattern.structure.proxy.protectionproxy;


import charlie.designpattern.structure.proxy.remoteproxy.ReportGenerator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by charlie on 10/01/2018.
 */
public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    ReportGenerator reportGenerator;
    Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()) {
            try {
                reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
                return reportGenerator.generateDailyReport();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return "Not Authorized to view the report.";
    }
}
