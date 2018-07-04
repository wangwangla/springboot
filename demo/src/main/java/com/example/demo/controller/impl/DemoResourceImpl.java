package com.example.demo.controller.impl;

import com.example.demo.msg.MSG;
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
    public List<User> getData(){
        return userService.getList();
    }
    @Override
    public Common<List<User>> getDemoList() {
        List<User> list = getData();
        Common <List<User>> common = new Common<List<User>>();
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
    public Common<User> addInfo(@RequestBody User user) {
        Common<User> common = new Common<User>();
        try {
            userService.addInfo(user);
        }catch (Exception e){
            common.setMsg(MSG.USER_ADD_FAILED.getMsg());
            common.setCode(MSG.USER_ADD_FAILED.getCode());
            common.setObject(user);
        }
        common.setCode(MSG.USER_ADD_SUCCESS.getCode());
        common.setMsg(MSG.USER_ADD_SUCCESS.getMsg());
        common.setObject(user);
        return common;
    }

    @Override
    public Common<List<User>> delete(@PathVariable("id") String id) {
        Common<List<User>> common = new Common<List<User>>();
        try{
            userService.findById(id);
        }catch (Exception e){
            common.setCode(MSG.USER_DELETE_NULLINFO.getCode());
            common.setMsg(MSG.USER_DELETE_NULLINFO.getMsg());
            common.setObject(getData());
            return common;
        }
        try{
            userService.delete(id);
        }catch (Exception e){
            common.setCode(MSG.USER_DELETE_FAILED.getCode());
            common.setMsg(MSG.USER_DELETE_FAILED.getMsg());
            common.setObject(getData());
            return common;
        }
        common.setCode(MSG.USER_DELETE_FAILED.getCode());
        common.setMsg(MSG.USER_DELETE_SUCCESS.getMsg());
        common.setObject(getData());
        return common;
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
