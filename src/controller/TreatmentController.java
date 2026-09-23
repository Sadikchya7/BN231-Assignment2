package controller;

import model.Treatment;
import java.util.ArrayList;
import java.util.List;

public class TreatmentController {

    private List<Treatment> treatments;

    public TreatmentController() {
        treatments = new ArrayList<>();
    }

    public void recordTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public Treatment searchTreatment(int treatmentId) {
        for (Treatment treatment : treatments) {
            if (treatment.getTreatmentId() == treatmentId) {
                return treatment;
            }
        }
        return null;
    }

    public boolean updateTreatment(int treatmentId,
                                   String treatmentDate,
                                   String diagnosis,
                                   String description) {

        Treatment treatment = searchTreatment(treatmentId);

        if (treatment != null) {
            treatment.updateTreatment(
                    treatmentDate,
                    diagnosis,
                    description
            );
            return true;
        }

        return false;
    }

    public boolean deleteTreatment(int treatmentId) {
        Treatment treatment = searchTreatment(treatmentId);

        if (treatment != null) {
            treatments.remove(treatment);
            return true;
        }

        return false;
    }
}