package com.test.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * auther   kangwang
 */
@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String hello()
    {
        return "你好，springboot";
    }

}
