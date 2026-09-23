package model;

public class Clinic {

    private int clinicId;
    private String clinicName;
    private String address;
    private String phone;

    public Clinic(int clinicId, String clinicName,
                  String address, String phone) {
        this.clinicId = clinicId;
        this.clinicName = clinicName;
        this.address = address;
        this.phone = phone;
    }

    public int getClinicId() {
        return clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Clinic ID: " + clinicId +
                ", Name: " + clinicName +
                ", Address: " + address +
                ", Phone: " + phone;
    }
}