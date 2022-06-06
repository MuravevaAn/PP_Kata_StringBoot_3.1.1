package com.muraveva.springboot.service;

import com.muraveva.springboot.dao.UserDao;
import com.muraveva.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;


    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User updatedUser, long id) {
        userDao.updateUser(updatedUser, id);
    }

    @Override
    public User show(long id) {
        return userDao.show(id);
    }
}
