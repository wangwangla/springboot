package com.example.demo.controller.impl;

import com.example.demo.controller.DemoResource;
import com.example.demo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * auther   kangwang
 * 2018/7/4
 */
@RestController
public class DemoResourceImpl implements DemoResource {

    @Autowired private UserService userService;

    /**
     *
     * @return
     */
    @Override
    public List<User> getDemoList() {
        return userService.getList();
    }

    @Override
    public User addInfo(@RequestBody User user) {
        System.out.println(user);
        userService.addInfo(user);
        return user;
    }

    @Override
    public List<User> delete(@PathVariable("id") String id) {
        System.out.print("========"+id);
       userService.delete(id);
        return getDemoList();
    }

    @Override
    public List<User> editInfo(User user) {
        userService.editInfo(user);
       return getDemoList();
    }
}
