package com.fh;

import com.fh.utils.ResponseServer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@FeignClient(value = "cloud-feign-brand",fallback = InterfaseApiImpl.class)
public interface InterfaseApi {

    @PostMapping("/brand/queryList")
    public Map<String,Object> queryList(@RequestParam("page") Long page,@RequestParam("limit") Long limit);

    @DeleteMapping("/brand/deleteBrand")
    public ResponseServer deleteBrand(@RequestParam("id") Integer id);
}
