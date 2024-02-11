import java.time.LocalDate;

public class User {
    private String lastName;
    private String firstName;
    private String surName;
    private LocalDate dateBirth;
    private long phoneNum;
    private char gender;

    /**
     * Конструктор
     * 
     * @param lastName  Фамилия
     * @param firstName Имя
     * @param surName   Отчество
     * @param dateBirth Дата рождения
     * @param phoneNum  Номер телефона
     * @param gender    Пол
     */
    public User(String lastName, String firstName, String surName, LocalDate dateBirth, long phoneNum, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.dateBirth = dateBirth;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<" + lastName + "><" + firstName + "><" + surName + "><" + dateBirth + "><" + phoneNum + "><" + gender + ">";
    }

}
