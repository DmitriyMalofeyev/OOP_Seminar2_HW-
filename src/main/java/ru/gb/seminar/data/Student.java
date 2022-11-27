package ru.gb.seminar.data;

public class Student extends User{
    private Long studentID;

    public Student(String firstName, String patronymic, String lastName, Long studentID) {
        super(firstName, patronymic, lastName);
        this.studentID = studentID;
    }


    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
