package controller;

import model.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorController {

    private List<Doctor> doctors;

    public DoctorController() {
        doctors = new ArrayList<>();
    }

    public void registerDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public Doctor searchDoctor(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

    public boolean updateDoctorSchedule(int doctorId, String schedule) {
        Doctor doctor = searchDoctor(doctorId);

        if (doctor != null) {
            doctor.updateSchedule(schedule);
            return true;
        }

        return false;
    }

    public boolean deleteDoctor(int doctorId) {
        Doctor doctor = searchDoctor(doctorId);

        if (doctor != null) {
            doctors.remove(doctor);
            return true;
        }

        return false;
    }
}