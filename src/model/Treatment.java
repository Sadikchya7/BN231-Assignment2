package model;

public class Treatment {

    private int treatmentId;
    private Patient patient;
    private Doctor doctor;
    private String treatmentDate;
    private String diagnosis;
    private String description;

    public Treatment(int treatmentId,
                     Patient patient,
                     Doctor doctor,
                     String treatmentDate,
                     String diagnosis,
                     String description) {

        this.treatmentId = treatmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.treatmentDate = treatmentDate;
        this.diagnosis = diagnosis;
        this.description = description;
    }

    public int getTreatmentId() {
        return treatmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDescription() {
        return description;
    }

    public void updateTreatment(String treatmentDate,
                                String diagnosis,
                                String description) {

        this.treatmentDate = treatmentDate;
        this.diagnosis = diagnosis;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Treatment ID: " + treatmentId
                + ", Patient: " + patient.getName()
                + ", Doctor: " + doctor.getName()
                + ", Date: " + treatmentDate
                + ", Diagnosis: " + diagnosis
                + ", Description: " + description;
    }
}