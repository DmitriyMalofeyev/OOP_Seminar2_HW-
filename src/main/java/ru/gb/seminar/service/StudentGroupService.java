package ru.gb.seminar.service;

import ru.gb.seminar.data.Student;
import ru.gb.seminar.data.StudentGroup;
import ru.gb.seminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    public List<StudentGroup> completeStudentGroup(Teacher teacher, List<Student> studentList){

        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(new StudentGroup(teacher, studentList));
        return studentGroupList;
    }
}

