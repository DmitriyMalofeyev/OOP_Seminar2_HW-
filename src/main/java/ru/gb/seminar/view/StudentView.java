package ru.gb.seminar.view;

import ru.gb.seminar.data.StudentGroup;
import ru.gb.seminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();

        for (User user: users){
            logger.info(user.toString());
        }
    }
    public void showStudentGroups(List<StudentGroup> studentGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudentGroup group : studentGroups) {
            log.info(group.toString());
        }
    }

    public void sendOnControl(List<User>users){
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (User user : users){
            logger.info(user.toString());
        }
    }
}
