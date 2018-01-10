package charlie.designpattern.structure.proxy.protectionproxy;

/**
 * Created by charlie on 10/01/2018.
 */
public class Employee implements Staff {

    private ReportGeneratorProxy reportGenerator;

    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport() {
        return this.reportGenerator.generateDailyReport();
    }
}
