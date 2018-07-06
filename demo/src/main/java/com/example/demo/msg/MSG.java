package com.example.demo.msg;

public enum MSG {
    USER_LIST_SUCCESS(1,"查询成功！"),
    USER_LIST_FAILED(2,"查询失败"),
    USER_ADD_SUCCESS(3,"添加成功！"),
    USER_ADD_FAILED(4,"添加失败"),
    USER_DELETE_FAILED(5,"删除失败"),
    USER_DELETE_SUCCESS(6,"删除成功"),
    USER_DELETE_NULLINFO(7,"没有找到数据，无法删除"),
    USER_IS_NULL(8,"传入参数为null") ,
    ID_IS_NULL (9,"id为空！") ,
    USER_NOT_FOUND (10,"用户为找到") ;
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
