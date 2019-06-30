package javaClasses;

import java.time.LocalDate;

//1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate dateOfBirth;
    private String address;
    private int phone;
    private String faculty;
    private int course;
    private int group;

    Student (int id, String surname, String name, String middleName, LocalDate dateOfBirth,
             String address, int phone, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Student with id № " + getId() + ":" + "\n");
        buffer.append("Surname: " + getSurname() + ", " + "Name: " + getName() + ", " + "Middle Name: " + getMiddleName() + ", " +
                "Date of Birth: " + getDateOfBirth() + ", " + "Address: " + getAddress() + ", " + "Phone: " + getPhone() + ", " +
                "Faculty: " + getFaculty() + ", " + "Course: " + getCourse() + ", " + "Group: " + getGroup() + ".");

        return buffer.toString();
    }
}
