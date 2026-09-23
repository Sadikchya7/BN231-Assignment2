package view;

import javax.swing.*;
import java.awt.*;

public class ClinicView extends JFrame {

    private JButton patientButton;
    private JButton doctorButton;
    private JButton appointmentButton;
    private JButton treatmentButton;
    private JButton searchButton;
    private JButton reportButton;

    public ClinicView() {

        setTitle("Community Health Clinic Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel(
                "Community Health Clinic Management System",
                SwingConstants.CENTER
        );

        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        patientButton = new JButton("Patient Management");
        doctorButton = new JButton("Doctor Management");
        appointmentButton = new JButton("Appointment Management");
        treatmentButton = new JButton("Treatment Management");
        searchButton = new JButton("Search Records");
        reportButton = new JButton("Reports");

        JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        buttonPanel.add(patientButton);
        buttonPanel.add(doctorButton);
        buttonPanel.add(appointmentButton);
        buttonPanel.add(treatmentButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(reportButton);

        setLayout(new BorderLayout(10, 10));

        add(titleLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public JButton getPatientButton() {
        return patientButton;
    }

    public JButton getDoctorButton() {
        return doctorButton;
    }

    public JButton getAppointmentButton() {
        return appointmentButton;
    }

    public JButton getTreatmentButton() {
        return treatmentButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JButton getReportButton() {
        return reportButton;
    }
}