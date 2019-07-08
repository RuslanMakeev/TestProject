package javaClasses_Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        List<Student> studentList = new ArrayList<>();
        superClass.addStudentsToArray(new Student(15, "Ivanov", "Ivan", "Ruslanovich", LocalDate.of(1999, 10, 15), "Minsk",
                5255533, "OKO", 3, 654));
        superClass.addStudentsToArray(new Student(16, "Smirnov", "Iran", "Ruslanovich", LocalDate.of(1900, 8, 10), "Minsk",
                5255311, "FVR", 5, 654));
        superClass.addStudentsToArray(new Student(22, "Sidorov", "Vasya", "Ruslanovich", LocalDate.of(1955, 8, 10), "Minsk",
                5255311, "FVR", 5, 654));

//        studentList = superClass.getStudentsByFaculty("OKO");
//        studentList = superClass.getStudentsByGroup(654);
        studentList = superClass.getStudentsByDr(1950);

//        for (Student i : studentList) { a) список студентов заданного факультета;
//            System.out.println(i);
//        }
        for (Student i : studentList) { // d) список учебной группы.
            System.out.println(i);
        }
    }
}
