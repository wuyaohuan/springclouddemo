package com.fh.controller;

import com.fh.service.BrandService;
import com.fh.utils.ResponseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("queryList")
    public Map<String,Object> queryList(Long page,Long limit){
        Map<String,Object> map=brandService.queryList(page,limit);
        return map;
    }
    @DeleteMapping("deleteBrand")
    public ResponseServer deleteBrand(Integer id){
        brandService.deleteBrand(id);
        return ResponseServer.success();
    }
}
