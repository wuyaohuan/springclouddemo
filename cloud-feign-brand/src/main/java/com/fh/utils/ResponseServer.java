package com.fh.utils;

import lombok.Data;

@Data
public class ResponseServer {


    //-------------------------------属性-------------------------------
    private int code;
    private String msg;

    //例如：修改返回数据
    private Object data;

    //-------------------------------有参构造-------------------------------
    public ResponseServer(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseServer(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    //************************ 成功的返回的方法  ********************************
    //操作成功返回的方法
    public static ResponseServer success(){
        return new ResponseServer(EnumResult.SUCCESS.getCode(), EnumResult.SUCCESS.getMsg());
    }
    //个性化成功返回的方法-
    public static ResponseServer success(EnumResult enumResult){
        return new ResponseServer(enumResult.getCode(),enumResult.getMsg());
    }

    //操作成功返回的带数据的方法
    public static ResponseServer success(Object data){
        return new ResponseServer(EnumResult.SUCCESS.getCode(), EnumResult.SUCCESS.getMsg(),data);
    }
    //个性化成功返回带数据的方法
    public static ResponseServer success(EnumResult enumResult, Object data){
        return new ResponseServer(enumResult.getCode(),enumResult.getMsg(),data);
    }


    //************************ 失败的返回的方法  ********************************
    //操作失败返回的方法
    public static ResponseServer error(){
        return new ResponseServer(EnumResult.ERROR.getCode(), EnumResult.ERROR.getMsg());
    }

    //个性化失败返回的方法
    public static ResponseServer error(EnumResult enumResult){
        return new ResponseServer(enumResult.getCode(),enumResult.getMsg());
    }

    //操作失败返回的  带数据  的方法
    public static ResponseServer error(Object data){
        return new ResponseServer(EnumResult.ERROR.getCode(), EnumResult.ERROR.getMsg(),data);
    }
    //个性化失败返回  带数据  的方法
    public static ResponseServer error(EnumResult enumResult, Object data){
        return new ResponseServer(enumResult.getCode(),enumResult.getMsg(),data);
    }

}
