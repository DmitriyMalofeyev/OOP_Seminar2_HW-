package ru.gb.seminar.service;

import ru.gb.seminar.data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName, String patronymic, String lastName);
    List<User> getAll();
    void deleteUser(Long id);
}

