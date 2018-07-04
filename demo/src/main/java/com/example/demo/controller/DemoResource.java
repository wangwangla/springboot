package com.example.demo.controller;

import com.example.demo.User;
import com.example.demo.vo.response.Common;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * auther   kangwang
 * 2018/7/4
 */
@RequestMapping("Demo")
public interface DemoResource {
    @GetMapping("list")
    Common<List<User>> getDemoList();
    @PostMapping("add")
    Common<User> addInfo(User user);
    @RequestMapping("delete/{id}")
    Common<List<User>> delete(@PathVariable("id") String id);
    @PostMapping("edit")
    List<User> editInfo(@RequestBody User user);
}
