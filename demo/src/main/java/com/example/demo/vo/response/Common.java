package com.example.demo.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * auther   kangwang
 * 2018/7/4
 */
public class Common<T>{
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("value")
    T object;

    public Common() {
    }
    public Common(Integer code, String msg, T object) {

        this.code = code;
        this.msg = msg;
        this.object = object;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
