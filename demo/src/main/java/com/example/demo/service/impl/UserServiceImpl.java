package com.example.demo.service.impl;

import com.example.demo.User;
import com.example.demo.UserDemo.UserDao.UserDao;

import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * auther   kangwang
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserDao userDao;
    @Override
    public List<User> getList() {
        return userDao.findAll();
    }

    @Override
    public User addInfo(User user) {
        System.out.print(user);
        userDao.save(user);
        return user;
    }

    @Override
    public void delete(String id) {
        userDao.deleteById(id);
    }

    @Override
    public void editInfo(User user) {
        userDao.save(user);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id).get();
    }
}