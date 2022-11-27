package ru.gb.seminar.data;

public class Teacher extends User{
    private Long teacherID;

    public Teacher(String firstName, String patronymic, String lastName, Long teacherID) {
        super(firstName, patronymic, lastName);
        this.teacherID = teacherID;
    }


    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }
}
