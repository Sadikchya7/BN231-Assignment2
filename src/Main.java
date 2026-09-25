import controller.AppointmentController;
import controller.DoctorController;
import controller.PatientController;
import controller.TreatmentController;
import controller.ReportController;

import model.Appointment;
import model.Doctor;
import model.Patient;
import model.Treatment;
import model.Report;

import service.FileManager;

import view.AppointmentView;
import view.ClinicView;
import view.DoctorView;
import view.PatientView;
import view.TreatmentView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // =========================
            // CONTROLLERS


            PatientController patientController =
                    new PatientController();

            DoctorController doctorController =
                    new DoctorController();

            AppointmentController appointmentController =
                    new AppointmentController();

            TreatmentController treatmentController =
                    new TreatmentController();

            ReportController reportController =
                    new ReportController();

            FileManager fileManager =
                    new FileManager();

            ClinicView clinicView = new ClinicView();


            // =========================
            // PATIENT MANAGEMENT
            // =========================

            clinicView.getPatientButton().addActionListener(e -> {

                PatientView patientView = new PatientView();

                patientView.getRegisterButton()
                        .addActionListener(event -> {

                            try {

                                int id = Integer.parseInt(
                                        patientView.getIdField().getText()
                                );

                                String name =
                                        patientView.getNameField().getText();

                                String phone =
                                        patientView.getPhoneField().getText();

                                String address =
                                        patientView.getAddressField().getText();

                                String dob =
                                        patientView.getDobField().getText();

                                if (name.isEmpty()
                                        || phone.isEmpty()
                                        || address.isEmpty()
                                        || dob.isEmpty()) {

                                    JOptionPane.showMessageDialog(
                                            patientView,
                                            "Please fill in all fields."
                                    );

                                    return;
                                }

                                Patient patient = new Patient(
                                        id,
                                        name,
                                        phone,
                                        address,
                                        dob
                                );

                                patientController.registerPatient(patient);

                                JOptionPane.showMessageDialog(
                                        patientView,
                                        "Patient registered successfully!"
                                );

                            } catch (NumberFormatException ex) {

                                JOptionPane.showMessageDialog(
                                        patientView,
                                        "Patient ID must be a number."
                                );
                            }
                        });


                patientView.getSearchButton()
                        .addActionListener(event -> {

                            try {

                                int id = Integer.parseInt(
                                        patientView.getIdField().getText()
                                );

                                Patient patient =
                                        patientController.searchPatient(id);

                                if (patient != null) {

                                    JOptionPane.showMessageDialog(
                                            patientView,
                                            patient.toString(),
                                            "Patient Found",
                                            JOptionPane.INFORMATION_MESSAGE
                                    );

                                } else {

                                    JOptionPane.showMessageDialog(
                                            patientView,
                                            "Patient not found."
                                    );
                                }

                            } catch (NumberFormatException ex) {

                                JOptionPane.showMessageDialog(
                                        patientView,
                                        "Please enter a valid Patient ID."
                                );
                            }
                        });

                patientView.setVisible(true);
            });


            // =========================
            // DOCTOR MANAGEMENT
            // =========================

            clinicView.getDoctorButton().addActionListener(e -> {

                DoctorView doctorView = new DoctorView();

                doctorView.getRegisterButton()
                        .addActionListener(event -> {

                            try {

                                int id = Integer.parseInt(
                                        doctorView.getIdField().getText()
                                );

                                String name =
                                        doctorView.getNameField().getText();

                                String specialization =
                                        doctorView.getSpecializationField()
                                                .getText();

                                String phone =
                                        doctorView.getPhoneField().getText();

                                String schedule =
                                        doctorView.getScheduleField()
                                                .getText();

                                if (name.isEmpty()
                                        || specialization.isEmpty()
                                        || phone.isEmpty()
                                        || schedule.isEmpty()) {

                                    JOptionPane.showMessageDialog(
                                            doctorView,
                                            "Please fill in all fields."
                                    );

                                    return;
                                }

                                Doctor doctor = new Doctor(
                                        id,
                                        name,
                                        specialization,
                                        phone,
                                        schedule
                                );

                                doctorController.registerDoctor(doctor);

                                JOptionPane.showMessageDialog(
                                        doctorView,
                                        "Doctor registered successfully!"
                                );

                            } catch (NumberFormatException ex) {

                                JOptionPane.showMessageDialog(
                                        doctorView,
                                        "Doctor ID must be a number."
                                );
                            }
                        });


                doctorView.getSearchButton()
                        .addActionListener(event -> {

                            try {

                                int id = Integer.parseInt(
                                        doctorView.getIdField().getText()
                                );

                                Doctor doctor =
                                        doctorController.searchDoctor(id);

                                if (doctor != null) {

                                    JOptionPane.showMessageDialog(
                                            doctorView,
                                            doctor.toString(),
                                            "Doctor Found",
                                            JOptionPane.INFORMATION_MESSAGE
                                    );

                                } else {

                                    JOptionPane.showMessageDialog(
                                            doctorView,
                                            "Doctor not found."
                                    );
                                }

                            } catch (NumberFormatException ex) {

                                JOptionPane.showMessageDialog(
                                        doctorView,
                                        "Please enter a valid Doctor ID."
                                );
                            }
                        });

                doctorView.setVisible(true);
            });


            // =========================
            // APPOINTMENT MANAGEMENT
            // =========================

            clinicView.getAppointmentButton()
                    .addActionListener(e -> {

                        AppointmentView appointmentView =
                                new AppointmentView();

                        appointmentView.getScheduleButton()
                                .addActionListener(event -> {

                                    try {

                                        int appointmentId =
                                                Integer.parseInt(
                                                        appointmentView
                                                                .getIdField()
                                                                .getText()
                                                );

                                        int patientId =
                                                Integer.parseInt(
                                                        appointmentView
                                                                .getPatientIdField()
                                                                .getText()
                                                );

                                        int doctorId =
                                                Integer.parseInt(
                                                        appointmentView
                                                                .getDoctorIdField()
                                                                .getText()
                                                );

                                        String date =
                                                appointmentView
                                                        .getDateField()
                                                        .getText();

                                        String time =
                                                appointmentView
                                                        .getTimeField()
                                                        .getText();

                                        if (date.isEmpty()
                                                || time.isEmpty()) {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    "Please enter the date and time."
                                            );

                                            return;
                                        }

                                        Patient patient =
                                                patientController
                                                        .searchPatient(patientId);

                                        Doctor doctor =
                                                doctorController
                                                        .searchDoctor(doctorId);

                                        if (patient == null) {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    "Patient not found."
                                            );

                                            return;
                                        }

                                        if (doctor == null) {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    "Doctor not found."
                                            );

                                            return;
                                        }

                                        Appointment appointment =
                                                new Appointment(
                                                        appointmentId,
                                                        patient,
                                                        doctor,
                                                        date,
                                                        time,
                                                        "Scheduled"
                                                );

                                        appointmentController
                                                .scheduleAppointment(appointment);

                                        JOptionPane.showMessageDialog(
                                                appointmentView,
                                                "Appointment scheduled successfully!"
                                        );

                                    } catch (NumberFormatException ex) {

                                        JOptionPane.showMessageDialog(
                                                appointmentView,
                                                "ID fields must contain numbers."
                                        );
                                    }
                                });


                        appointmentView.getSearchButton()
                                .addActionListener(event -> {

                                    try {

                                        int appointmentId =
                                                Integer.parseInt(
                                                        appointmentView
                                                                .getIdField()
                                                                .getText()
                                                );

                                        Appointment appointment =
                                                appointmentController
                                                        .searchAppointment(
                                                                appointmentId
                                                        );

                                        if (appointment != null) {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    appointment.toString(),
                                                    "Appointment Found",
                                                    JOptionPane.INFORMATION_MESSAGE
                                            );

                                        } else {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    "Appointment not found."
                                            );
                                        }

                                    } catch (NumberFormatException ex) {

                                        JOptionPane.showMessageDialog(
                                                appointmentView,
                                                "Please enter a valid Appointment ID."
                                        );
                                    }
                                });


                        appointmentView.getCancelButton()
                                .addActionListener(event -> {

                                    try {

                                        int appointmentId =
                                                Integer.parseInt(
                                                        appointmentView
                                                                .getIdField()
                                                                .getText()
                                                );

                                        boolean cancelled =
                                                appointmentController
                                                        .cancelAppointment(
                                                                appointmentId
                                                        );

                                        if (cancelled) {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    "Appointment cancelled successfully!"
                                            );

                                        } else {

                                            JOptionPane.showMessageDialog(
                                                    appointmentView,
                                                    "Appointment not found."
                                            );
                                        }

                                    } catch (NumberFormatException ex) {

                                        JOptionPane.showMessageDialog(
                                                appointmentView,
                                                "Please enter a valid Appointment ID."
                                        );
                                    }
                                });

                        appointmentView.setVisible(true);
                    });


            // =========================
            // TREATMENT MANAGEMENT
            // =========================

            clinicView.getTreatmentButton()
                    .addActionListener(e -> {

                        TreatmentView treatmentView =
                                new TreatmentView();

                        treatmentView.getRecordButton()
                                .addActionListener(event -> {

                                    try {

                                        int treatmentId =
                                                Integer.parseInt(
                                                        treatmentView
                                                                .getIdField()
                                                                .getText()
                                                );

                                        int patientId =
                                                Integer.parseInt(
                                                        treatmentView
                                                                .getPatientIdField()
                                                                .getText()
                                                );

                                        int doctorId =
                                                Integer.parseInt(
                                                        treatmentView
                                                                .getDoctorIdField()
                                                                .getText()
                                                );

                                        String date =
                                                treatmentView
                                                        .getDateField()
                                                        .getText();

                                        String diagnosis =
                                                treatmentView
                                                        .getDiagnosisField()
                                                        .getText();

                                        String description =
                                                treatmentView
                                                        .getDescriptionField()
                                                        .getText();

                                        if (date.isEmpty()
                                                || diagnosis.isEmpty()
                                                || description.isEmpty()) {

                                            JOptionPane.showMessageDialog(
                                                    treatmentView,
                                                    "Please fill in all fields."
                                            );

                                            return;
                                        }

                                        Patient patient =
                                                patientController
                                                        .searchPatient(patientId);

                                        Doctor doctor =
                                                doctorController
                                                        .searchDoctor(doctorId);

                                        if (patient == null) {

                                            JOptionPane.showMessageDialog(
                                                    treatmentView,
                                                    "Patient not found."
                                            );

                                            return;
                                        }

                                        if (doctor == null) {

                                            JOptionPane.showMessageDialog(
                                                    treatmentView,
                                                    "Doctor not found."
                                            );

                                            return;
                                        }

                                        Treatment treatment =
                                                new Treatment(
                                                        treatmentId,
                                                        patient,
                                                        doctor,
                                                        date,
                                                        diagnosis,
                                                        description
                                                );

                                        treatmentController
                                                .recordTreatment(treatment);

                                        JOptionPane.showMessageDialog(
                                                treatmentView,
                                                "Treatment recorded successfully!"
                                        );

                                    } catch (NumberFormatException ex) {

                                        JOptionPane.showMessageDialog(
                                                treatmentView,
                                                "ID fields must contain numbers."
                                        );
                                    }
                                });


                        treatmentView.getSearchButton()
                                .addActionListener(event -> {

                                    try {

                                        int treatmentId =
                                                Integer.parseInt(
                                                        treatmentView
                                                                .getIdField()
                                                                .getText()
                                                );

                                        Treatment treatment =
                                                treatmentController
                                                        .searchTreatment(
                                                                treatmentId
                                                        );

                                        if (treatment != null) {

                                            JOptionPane.showMessageDialog(
                                                    treatmentView,
                                                    treatment.toString(),
                                                    "Treatment Found",
                                                    JOptionPane.INFORMATION_MESSAGE
                                            );

                                        } else {

                                            JOptionPane.showMessageDialog(
                                                    treatmentView,
                                                    "Treatment not found."
                                            );
                                        }

                                    } catch (NumberFormatException ex) {

                                        JOptionPane.showMessageDialog(
                                                treatmentView,
                                                "Please enter a valid Treatment ID."
                                        );
                                    }
                                });

                        treatmentView.setVisible(true);
                    });


            // =========================
            // REPORT CONTROLLER
            // =========================

            reportController.addReport(
                    new Report(
                            3003,
                            "Patient Report",
                            "23/09/2026",
                            "Patient records"
                    )
            );

            reportController.addReport(
                    new Report(
                            3001,
                            "Appointment Report",
                            "23/09/2026",
                            "Appointment records"
                    )
            );

            reportController.addReport(
                    new Report(
                            3002,
                            "Treatment Report",
                            "23/09/2026",
                            "Treatment records"
                    )
            );


            // =========================
            // REPORTS, SORTING,
            // SAVING AND LOADING
            // =========================

            clinicView.getReportButton()
                    .addActionListener(e -> {

                        // Sort reports
                        reportController.sortReportsById();

                        // Prepare data for saving
                        List<String> reportData =
                                new ArrayList<>();

                        for (Report report :
                                reportController.getReports()) {

                            reportData.add(
                                    report.toString()
                            );
                        }

                        // Save reports to file
                        String fileName = "reports.txt";

                        fileManager.saveData(
                                fileName,
                                reportData
                        );

                        // Load reports from file
                        List<String> loadedReports =
                                fileManager.loadData(
                                        fileName
                                );

                        // Display loaded reports
                        StringBuilder reportList =
                                new StringBuilder();

                        reportList.append(
                                "Reports sorted, saved and loaded successfully:\n\n"
                        );

                        for (String report :
                                loadedReports) {

                            reportList.append(
                                    report
                            );

                            reportList.append(
                                    "\n\n"
                            );
                        }

                        JOptionPane.showMessageDialog(
                                clinicView,
                                reportList.toString(),
                                "Reports - Save / Load",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    });


            // =========================
            // START APPLICATION
            // =========================

            clinicView.setVisible(true);
        });
    }
}