package view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {

    private JTextField idField;
    private JTextField nameField;
    private JTextField specializationField;
    private JTextField phoneField;
    private JTextField scheduleField;

    private JButton registerButton;
    private JButton searchButton;

    public DoctorView() {

        setTitle("Doctor Management");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Doctor ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Specialization:"));
        specializationField = new JTextField();
        panel.add(specializationField);

        panel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Schedule:"));
        scheduleField = new JTextField();
        panel.add(scheduleField);

        registerButton = new JButton("Register Doctor");
        searchButton = new JButton("Search Doctor");

        panel.add(registerButton);
        panel.add(searchButton);

        add(panel);
    }

    public JTextField getIdField() {
        return idField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getSpecializationField() {
        return specializationField;
    }

    public JTextField getPhoneField() {
        return phoneField;
    }

    public JTextField getScheduleField() {
        return scheduleField;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }
}