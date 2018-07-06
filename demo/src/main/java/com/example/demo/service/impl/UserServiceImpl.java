package com.example.demo.service.impl;

import com.example.demo.Exception.UserException;
import com.example.demo.UserDemo.UserDao.UserDao;
import com.example.demo.entry.User;
import com.example.demo.msg.MSG;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

/**
 * auther   kangwang
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserDao userDao;

    @Override
    public List<User> getList() throws UserException {
        List<User> userList = userDao.findAll();
        if(userList==null){
            throw new UserException(MSG.USER_IS_NULL.getMsg());
        }
        return userList;
    }

    @Override
    public User addInfo(User user) throws UserException {
        if(user==null){
            throw new UserException(MSG.USER_IS_NULL.getMsg());
        }
        userDao.save(user);
        return user;
    }

    @Override
    public void delete(String id) throws UserException {
        if(id == null) {
            throw new UserException(MSG.ID_IS_NULL.getMsg());
        }
        Optional<User> userOptional = userDao.findById(id);
        User user = userOptional.orElse(null);
        if(user !=null)
        {
            userDao.deleteById(id);
        }
    }

    @Override
    public void editInfo(User user) throws UserException {
        if(user == null)
        {
            throw new UserException(MSG.USER_IS_NULL.getMsg());
        }
        userDao.save(user);
    }

    @Override
    public User findById(String id) throws UserException {
        if(id == null) {
            throw new UserException(MSG.ID_IS_NULL.getMsg());
        }
        Optional<User> optionalUser = userDao.findById(id);
        if(optionalUser == null)
        {
            throw  new UserException(MSG.USER_NOT_FOUND.getMsg());
        }
        return optionalUser.get();
    }
}