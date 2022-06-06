package com.muraveva.springboot.dao;

import com.muraveva.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User show(long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user, long id);
}
