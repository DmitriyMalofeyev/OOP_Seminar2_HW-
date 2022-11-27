package ru.gb.seminar.controller;

import ru.gb.seminar.data.Student;
import ru.gb.seminar.data.StudentGroup;
import ru.gb.seminar.data.Teacher;
import ru.gb.seminar.data.User;
import ru.gb.seminar.service.StudentGroupService;
import ru.gb.seminar.service.UserService;
import ru.gb.seminar.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void createUser (String firstName, String patronymic, String lastName) {
        userService.createUser(firstName, patronymic, lastName);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public Teacher createTeacher(String firstName, String patronymic, String lastName, Long teacherId){
        return userService.createUser(firstName, patronymic, lastName, teacherId);
    }

    public List<Student> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
    public List<StudentGroup> createTimetable(Teacher teacher, List<Student> studentList) {
        return studentGroupService.completeStudentGroup(teacher, studentList);
    }

    public void showStudentGroups(List<StudentGroup> studentGroups){

        studentView.showStudentGroups(studentGroups);
    }
}
