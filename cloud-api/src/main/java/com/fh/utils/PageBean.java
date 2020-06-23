package com.fh.utils;

import lombok.Data;

@Data
public class PageBean {


    private Long page;//起始页
    private Long limit;
    private Long count;
    private String msg;
    private Object data;
    private Integer code;



    public PageBean(Long count, Object data) {
        this.count = count;
        this.msg = "查询成功";
        this.data = data;
        this.code = 0;
    }
}
