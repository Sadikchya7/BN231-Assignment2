package model;

public class Report {

    private int reportId;
    private String reportType;
    private String generatedDate;
    private String content;

    public Report(int reportId, String reportType,
                  String generatedDate, String content) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.generatedDate = generatedDate;
        this.content = content;
    }

    public int getReportId() {
        return reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public String getGeneratedDate() {
        return generatedDate;
    }

    public String getContent() {
        return content;
    }

    public void generateReport() {
        System.out.println("Generating " + reportType + " report...");
    }

    @Override
    public String toString() {
        return "Report ID: " + reportId +
                ", Type: " + reportType +
                ", Date: " + generatedDate +
                ", Content: " + content;
    }
}