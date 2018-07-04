package com.example.demo.service;

import com.example.demo.User;

import java.util.List;

/**
 * auther   kangwang
 * 2018/7/5
 */
public interface UserService {
    List<User> getList();
    User addInfo(User user);
    void delete(String id);
    void editInfo(User user);
    User findById(String id);
}
