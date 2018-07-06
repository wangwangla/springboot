package com.example.demo.service;

import com.example.demo.Exception.UserException;
import com.example.demo.entry.User;
import com.example.demo.vo.response.Common;

import java.util.List;

/**
 * auther   kangwang
 * 2018/7/5
 */
public interface UserService {
    List<User> getList() throws UserException;
    User addInfo(User user) throws UserException;
    void delete(String id) throws UserException;
    void editInfo(User user) throws UserException;
    User findById(String id) throws UserException;
}
