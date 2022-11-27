package ru.gb.seminar.data;

public abstract class User {
    private String firstname;
    private String lastName;
    private String patronymic;

    public User(String firstname, String patronymic, String lastName) {
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.lastName = lastName;

    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
