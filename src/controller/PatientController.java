package controller;

import model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientController {

    private List<Patient> patients;

    public PatientController() {
        patients = new ArrayList<>();
    }

    public void registerPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public Patient searchPatient(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    public boolean updatePatient(int patientId,
                                 String name,
                                 String phone,
                                 String address,
                                 String dateOfBirth) {

        Patient patient = searchPatient(patientId);

        if (patient != null) {
            patient.updateDetails(
                    name,
                    phone,
                    address,
                    dateOfBirth
            );
            return true;
        }

        return false;
    }

    public boolean deletePatient(int patientId) {
        Patient patient = searchPatient(patientId);

        if (patient != null) {
            patients.remove(patient);
            return true;
        }

        return false;
    }
}