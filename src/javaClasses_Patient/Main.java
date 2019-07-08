package javaClasses_Patient;

import javaClasses_Student.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        List<Patient> patientList = new ArrayList<>();
        superClass.addPatientsToArray(new Patient(15, "Ivanov", "Ivan", "Ruslanovich", "Minsk", 123456, "ORV", 777));
        superClass.addPatientsToArray(new Patient(20, "Petrov", "Zlatan", "Ibrahimovich", "Kiev", 555664, "PPP", 555));
        superClass.addPatientsToArray(new Patient(45, "Sidorov", "Igor", "Ruslanovich", "Minsk", 789789, "PPP", 321));


//        patientList = superClass.getPatientsByDiagnosis("PPP"); //a) список пациентов, имеющих данный диагноз;
        patientList = superClass.getPatientsByCardNumber(200, 500); //b) список пациентов, номер медицинской карты которых находится в заданном интервале.

        for (Patient i : patientList) {
            System.out.println(i);

        }
        if (patientList.isEmpty()){
            System.out.println("Olololo");

        }
    }
}