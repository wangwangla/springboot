package com.example.demo.Exception;

/**
 * auther   kangwang
 * UserException
 */
public class UserException extends Exception{
    private String exceptionMsg;
    public UserException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
