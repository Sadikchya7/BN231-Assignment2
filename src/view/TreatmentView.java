package view;

import javax.swing.*;
import java.awt.*;

public class TreatmentView extends JFrame {

    private JTextField idField;
    private JTextField patientIdField;
    private JTextField doctorIdField;
    private JTextField dateField;
    private JTextField diagnosisField;
    private JTextField descriptionField;

    private JButton recordButton;
    private JButton searchButton;

    public TreatmentView() {

        setTitle("Treatment Management");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));

        panel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );

        panel.add(new JLabel("Treatment ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Patient ID:"));
        patientIdField = new JTextField();
        panel.add(patientIdField);

        panel.add(new JLabel("Doctor ID:"));
        doctorIdField = new JTextField();
        panel.add(doctorIdField);

        panel.add(new JLabel("Treatment Date:"));
        dateField = new JTextField();
        panel.add(dateField);

        panel.add(new JLabel("Diagnosis:"));
        diagnosisField = new JTextField();
        panel.add(diagnosisField);

        panel.add(new JLabel("Description:"));
        descriptionField = new JTextField();
        panel.add(descriptionField);

        recordButton = new JButton("Record Treatment");
        searchButton = new JButton("Search Treatment");

        panel.add(recordButton);
        panel.add(searchButton);

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

    public JTextField getDiagnosisField() {
        return diagnosisField;
    }

    public JTextField getDescriptionField() {
        return descriptionField;
    }

    public JButton getRecordButton() {
        return recordButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }
}