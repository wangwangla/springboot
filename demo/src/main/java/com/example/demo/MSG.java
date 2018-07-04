package com.example.demo;

public enum MSG {
    USER_LIST_SUCCESS(1,"成功！"),
    USER_LIST_FAILED(2,"失败");

    private Integer code;
    private String  msg;

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

    private MSG(Integer code, String msg){
        this.code=code;
        this.msg = msg;

    }
}
