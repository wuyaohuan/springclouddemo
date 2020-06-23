package com.fh.utils;
//自定义异常


public class AccountVerifyException extends RuntimeException{

    private int code;

    public AccountVerifyException(EnumResult serverEnum){
        super(serverEnum.getMsg());
        this.code=serverEnum.getCode();
    }

    public int getCode() {
        return code;
    }
}
