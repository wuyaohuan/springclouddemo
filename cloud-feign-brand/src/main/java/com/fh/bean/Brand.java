package com.fh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tt_brand")
public class Brand{

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String area;
}
