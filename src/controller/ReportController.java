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

    public Report searchReport(int reportId) {
        for (Report report : reports) {
            if (report.getReportId() == reportId) {
                return report;
            }
        }

        return null;
    }

    public void sortReportsById() {
        reports.sort(
                Comparator.comparingInt(Report::getReportId)
        );
    }

    public void generateReport(int reportId) {
        Report report = searchReport(reportId);

        if (report != null) {
            report.generateReport();
        } else {
            System.out.println("Report not found.");
        }
    }
}