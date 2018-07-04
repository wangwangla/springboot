package com.example.demo.controller.impl;

import com.example.demo.MSG;
import com.example.demo.controller.DemoResource;
import com.example.demo.User;
import com.example.demo.service.UserService;
import com.example.demo.vo.response.Common;
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
    public Common<List> getDemoList() {
        List<User> list = userService.getList();

        Common <List> common = new Common<List>();
        if(list!=null)
        {
            common.setCode(MSG.USER_LIST_FAILED.getCode());
            common.setMsg(MSG.USER_LIST_FAILED.getMsg());
            common.setObject(list);
        }
        common.setCode(MSG.USER_LIST_SUCCESS.getCode());
        common.setMsg(MSG.USER_LIST_SUCCESS.getMsg());
        common.setObject(list);
        return common;
    }

    @Override
    public User addInfo(@RequestBody User user) {
        System.out.println(user);
        userService.addInfo(user);
        return user;
    }

    @Override
    public List<User> delete(String id) {
        return null;
    }

    @Override
    public List<User> editInfo(User user) {
        return null;
    }

   /* @Override
    public List<User> delete(@PathVariable("id") String id) {
        System.out.print("========"+id);
       userService.delete(id);
        return getDemoList();
    }

    @Override
    public List<User> editInfo(User user) {
        userService.editInfo(user);
       return getDemoList();
    }*/
}
