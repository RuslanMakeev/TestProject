package javaClasses_Student;

import java.util.ArrayList;
import java.util.List;

public class SuperClass {
    List<Student> students = new ArrayList<>();

    public void addStudentsToArray (Student object) {
        students.add(object);
    }
    public List<Student> getStudents() {
        return students;
    }
    public List<Student> getStudentsByFaculty(String fvr) {
        List<Student> studentsByFaculty = new ArrayList<>();


        for (Student i: students) {
            if (i.getFaculty() == fvr) {
                studentsByFaculty.add(i);
            }
        }
        return studentsByFaculty;

    }
    public List<Student> getStudentsByGroup(int group) {
        List<Student> studentsByGroup = new ArrayList<>();


        for (Student i: students) {
            if (i.getGroup() == group) {
                studentsByGroup.add(i);
            }
        }
        return studentsByGroup;

    }
    public List<Student> getStudentsByDr(int year) {
        List<Student> studentsByDr = new ArrayList<>();


        for (Student i: students) {
            if (i.getDateOfBirth().getYear() > year) {
                studentsByDr.add(i);
            }
        }
        return studentsByDr;

    }
}
