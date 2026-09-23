package controller;

import model.Report;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReportController {

    private List<Report> reports;

    public ReportController() {
        reports = new ArrayList<>();
    }

    public void addReport(Report report) {
        reports.add(report);
    }

    public List<Report> getReports() {
        return reports;
    }

    // Search report by ID
    public Report searchReport(int reportId) {
        for (Report report : reports) {
            if (report.getReportId() == reportId) {
                return report;
            }
        }
        return null;
    }

    // Sort reports by Report ID
    public void sortReportsById() {
        reports.sort(
                Comparator.comparingInt(Report::getReportId)
        );
    }

    // Generate report
    public void generateReport(int reportId) {
        Report report = searchReport(reportId);

        if (report != null) {
            report.generateReport();
        } else {
            System.out.println("Report not found.");
        }
    }
}