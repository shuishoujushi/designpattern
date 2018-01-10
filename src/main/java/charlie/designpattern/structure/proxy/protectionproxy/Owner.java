package charlie.designpattern.structure.proxy.protectionproxy;

/**
 * Created by charlie on 10/01/2018.
 */
public class Owner implements Staff {

    private boolean isOwner = true;
    private ReportGeneratorProxy reportGenerator;

    @Override
    public boolean isOwner() {
        return isOwner;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport() {
        return reportGenerator.generateDailyReport();
    }
}
