package view;

import javax.swing.*;
import java.awt.*;

public class PatientView extends JFrame {

    private JTextField idField;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField dobField;

    private JButton registerButton;
    private JButton searchButton;

    public PatientView() {

        setTitle("Patient Management");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Patient ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Address:"));
        addressField = new JTextField();
        panel.add(addressField);

        panel.add(new JLabel("Date of Birth:"));
        dobField = new JTextField();
        panel.add(dobField);

        registerButton = new JButton("Register Patient");
        searchButton = new JButton("Search Patient");

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

    public JTextField getPhoneField() {
        return phoneField;
    }

    public JTextField getAddressField() {
        return addressField;
    }

    public JTextField getDobField() {
        return dobField;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }
}