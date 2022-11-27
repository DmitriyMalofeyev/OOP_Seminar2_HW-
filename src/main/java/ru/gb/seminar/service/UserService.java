package ru.gb.seminar.service;

import ru.gb.seminar.data.Student;
import ru.gb.seminar.data.Teacher;
import ru.gb.seminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    private final List<User> users;

    public UserService() {

        this.users = new ArrayList<>();
    }


    public Teacher createUser(String firstName,  String patronymic, String lastName, Long Id) {
        return new Teacher(firstName, patronymic, lastName, Id);
    }

    @Override
    public void createUser(String firstName, String patronymic, String lastName) {
        Long id = 0L;
        for (User item: this.users){
            if (item instanceof Student){
                if (id < ((Student) item).getStudentID()){
                    id = (Long)((Student) item).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstName, patronymic, lastName, id++));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item: this.users) {
            if (item instanceof Student){
                if (id.equals(((Student) item).getStudentID())){
                    this.users.remove(item);
                }
            }
        }

    }
    public List<Student> getAllStudents(){
        List <Student> listStudents = new ArrayList<>();
        for (User user:this.getAll()
        ) {
            if(user instanceof Student){
                listStudents.add((Student) user);

            }

        }

        return listStudents;
    }
}

