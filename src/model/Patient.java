package model;

public class Patient {

    private int patientId;
    private String name;
    private String phone;
    private String address;
    private String dateOfBirth;

    public Patient(int patientId, String name, String phone,
                   String address, String dateOfBirth) {
        this.patientId = patientId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void updateDetails(String name, String phone,
                              String address, String dateOfBirth) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
                ", Name: " + name +
                ", Phone: " + phone +
                ", Address: " + address +
                ", Date of Birth: " + dateOfBirth;
    }
}