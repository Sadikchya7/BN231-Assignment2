package model;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;
    private String phone;
    private String schedule;

    public Doctor(int doctorId, String name, String specialization,
                  String phone, String schedule) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.schedule = schedule;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public void updateSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + doctorId +
                ", Name: " + name +
                ", Specialization: " + specialization +
                ", Phone: " + phone +
                ", Schedule: " + schedule;
    }
}