package controller;

import model.Report;
import model.Appointment;
import model.Patient;
import model.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReportControllerTest {

    @Test
    void searchReportShouldFindReportById() {

        ReportController controller = new ReportController();

        Report report = new Report(
                3001,
                "Appointment Report",
                "23/09/2026",
                "Appointment records"
        );

        controller.addReport(report);

        Report result = controller.searchReport(3001);

        assertNotNull(result);
        assertEquals(3001, result.getReportId());
        assertEquals("Appointment Report", result.getReportType());
    }

    @Test
    void searchReportShouldReturnNullWhenNotFound() {

        ReportController controller = new ReportController();

        assertNull(controller.searchReport(9999));
    }

    @Test
    void sortReportsByIdShouldSortAscending() {

        ReportController controller = new ReportController();

        controller.addReport(
                new Report(
                        3003,
                        "Patient Report",
                        "23/09/2026",
                        "Patient records"
                )
        );

        controller.addReport(
                new Report(
                        3001,
                        "Appointment Report",
                        "23/09/2026",
                        "Appointment records"
                )
        );

        controller.addReport(
                new Report(
                        3002,
                        "Treatment Report",
                        "23/09/2026",
                        "Treatment records"
                )
        );

        controller.sortReportsById();

        assertEquals(3001, controller.getReports().get(0).getReportId());
        assertEquals(3002, controller.getReports().get(1).getReportId());
        assertEquals(3003, controller.getReports().get(2).getReportId());
    }

    @Test
    void sortAppointmentsByDateShouldSortAscending() {

        AppointmentController controller = new AppointmentController();

        Patient patient = new Patient(
                1001,
                "John Smith",
                "0400000000",
                "Sydney",
                "01/01/2000"
        );

        Doctor doctor = new Doctor(
                2001,
                "Dr. Sarah Wilson",
                "General Medicine",
                "0498765432",
                "Monday-Friday 9:00 AM-5:00 PM"
        );

        Appointment appointment1 = new Appointment(
                3001,
                patient,
                doctor,
                "25/09/2026",
                "10:00 AM",
                "Scheduled"
        );

        Appointment appointment2 = new Appointment(
                3002,
                patient,
                doctor,
                "23/09/2026",
                "11:00 AM",
                "Scheduled"
        );

        controller.scheduleAppointment(appointment1);
        controller.scheduleAppointment(appointment2);

        controller.sortAppointmentsByDate();

        assertEquals(
                "23/09/2026",
                controller.getAppointments().get(0).getDate()
        );

        assertEquals(
                "25/09/2026",
                controller.getAppointments().get(1).getDate()
        );
    }

    @Test
    void updatePatientShouldUpdatePatientDetails() {

        PatientController controller = new PatientController();

        Patient patient = new Patient(
                1001,
                "John Smith",
                "0400000000",
                "Sydney",
                "01/01/2000"
        );

        controller.registerPatient(patient);

        boolean result = controller.updatePatient(
                1001,
                "John Updated",
                "0411111111",
                "Melbourne",
                "02/02/2000"
        );

        assertTrue(result);

        Patient updatedPatient = controller.searchPatient(1001);

        assertNotNull(updatedPatient);
        assertEquals("John Updated", updatedPatient.getName());
        assertEquals("0411111111", updatedPatient.getPhone());
        assertEquals("Melbourne", updatedPatient.getAddress());
        assertEquals(
                "02/02/2000",
                updatedPatient.getDateOfBirth()
        );
    }
}