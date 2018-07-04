package com.example.demo.controller;

import com.example.demo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * auther   kangwang
 * 2018/7/4
 */
@RequestMapping("Demo")
public interface DemoResource {
    @GetMapping("list")
    List<User> getDemoList();
    @PostMapping("add")
    User addInfo(User user);
    @RequestMapping("delete/{id}")
    List<User> delete(@PathVariable("id") String id);
    @PostMapping("edit")
    List<User> editInfo(@RequestBody User user);
}
