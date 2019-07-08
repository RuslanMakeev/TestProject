package javaClasses_Patient;

//3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
public class Patient {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int phone;
    private String diagnosis;
    private int cardNumber;

    Patient (int id, String surname, String name, String middleName, String address, int phone, String diagnosis, int cardNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.diagnosis = diagnosis;
        this.cardNumber = cardNumber;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("Patient with id № " + getId() + ":" + "\n");
        buffer.append("Surname: " + getSurname() + ", " + "Name: " + getName() + ", " + "Middle Name: " + getMiddleName() + ", " + ", " + "Address: " + getAddress() +
                ", " + "Phone: " + getPhone() + ", " + "Card Number: " + getCardNumber() + ", " + "Diagnosis: " + getDiagnosis() + ".");

        return buffer.toString();
    }
}

