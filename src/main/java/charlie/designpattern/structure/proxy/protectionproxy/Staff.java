package charlie.designpattern.structure.proxy.protectionproxy;

/**
 * Created by charlie on 10/01/2018.
 */
public interface Staff {
    boolean isOwner();
    void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
