package ru.gb.seminar;

import ru.gb.seminar.controller.Controller;
import ru.gb.seminar.data.StudentGroup;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Controller controller = new Controller();
        controller.createUser("Name", "Father's name", "Surname");
        controller.createUser("Александр", "Сергеевич", "Пушкин");
        controller.createUser("Гомер", "Джей", "Симпсон");
        controller.createUser("Владимир", "Ильич", "Ленин");
        controller.createUser("Юрий", "Владимирович", "Никулин");
        controller.createUser("Виктор", "Робертович", "Цой");
        controller.createUser("Винсент", "Теодорович", "ван Гог");
        controller.showAllStudents();

        List<StudentGroup> studentGroups  = controller.createTimetable(controller.createTeacher("Ирина", "Анатольевна", "Яровая", 99L),
                controller.getOnlyStudents());
        controller.showStudentGroups(studentGroups);
    }
}