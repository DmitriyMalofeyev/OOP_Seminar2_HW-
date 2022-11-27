package ru.gb.seminar.data;

import java.util.List;

public class StudentGroup {

    private final Teacher teacher;
    private final List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher=teacher;
        this.studentList=studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                ", studentList=" + studentList +"\n" +
                "teacher=" + teacher +
                '}';
    }
}