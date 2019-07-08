package javaClasses_Patient;

import java.util.ArrayList;
import java.util.List;

public class SuperClass {

    List<Patient> patients = new ArrayList<>();

    public void addPatientsToArray (Patient object) {
        patients.add(object);
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public List<Patient> getPatientsByDiagnosis(String dgn) {
        List<Patient> patientsByDiagnosis = new ArrayList<>();


        for (Patient i: patients) {
            if (i.getDiagnosis() == dgn) {
                patientsByDiagnosis.add(i);
            }
        }
        return patientsByDiagnosis;

    }
    public List<Patient> getPatientsByCardNumber(int rangeLow, int rangeHigh) {
        List<Patient> patientsByCardNumber = new ArrayList<>();


        for (Patient i: patients) {
            if (i.getCardNumber() > rangeLow && i.getCardNumber() < rangeHigh) {
                patientsByCardNumber.add(i);
            }
        }
        return patientsByCardNumber;

    }
}
