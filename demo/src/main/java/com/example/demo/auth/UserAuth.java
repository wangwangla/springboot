package com.example.demo.auth;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * auther   kangwang
 * 2018/7/6
 */
@Component
@Aspect
public class UserAuth {
    @Pointcut("execution(public * com.example.demo.controller.*.*(..))")
    public void log(){

    }
    @Before("log()")
    public void doBefore(){
        System.out.println("日志之前！");
    }
    @After("log()")
    public void doAfter(){
        System.out.println("日志之后");
    }
}
