package view;

import javax.swing.*;
import java.awt.*;

public class AppointmentView extends JFrame {

    private JTextField idField;
    private JTextField patientIdField;
    private JTextField doctorIdField;
    private JTextField dateField;
    private JTextField timeField;

    private JButton scheduleButton;
    private JButton searchButton;
    private JButton cancelButton;

    public AppointmentView() {

        setTitle("Appointment Management");
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Appointment ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Patient ID:"));
        patientIdField = new JTextField();
        panel.add(patientIdField);

        panel.add(new JLabel("Doctor ID:"));
        doctorIdField = new JTextField();
        panel.add(doctorIdField);

        panel.add(new JLabel("Date:"));
        dateField = new JTextField();
        panel.add(dateField);

        panel.add(new JLabel("Time:"));
        timeField = new JTextField();
        panel.add(timeField);

        panel.add(new JLabel("Status:"));
        panel.add(new JLabel("Scheduled"));

        scheduleButton = new JButton("Schedule Appointment");
        searchButton = new JButton("Search Appointment");
        cancelButton = new JButton("Cancel Appointment");

        panel.add(scheduleButton);
        panel.add(searchButton);

        panel.add(cancelButton);
        panel.add(new JLabel(""));

        add(panel);
    }

    public JTextField getIdField() {
        return idField;
    }

    public JTextField getPatientIdField() {
        return patientIdField;
    }

    public JTextField getDoctorIdField() {
        return doctorIdField;
    }

    public JTextField getDateField() {
        return dateField;
    }

    public JTextField getTimeField() {
        return timeField;
    }

    public JButton getScheduleButton() {
        return scheduleButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}