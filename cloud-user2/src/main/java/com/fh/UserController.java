package com.fh;

import com.fh.utils.EnumResult;
import com.fh.utils.ResponseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("users")
public class UserController {


    @Autowired
    private InterfaseApi interfaseApi;

    @PostMapping
    public Map<String,Object> queryList(){
        Map<String,Object> map= interfaseApi.queryList(1L,2L);
        return map;
    }
    @DeleteMapping
    public ResponseServer deleteBrand(){
        ResponseServer responseServer = interfaseApi.deleteBrand(2);
        return responseServer;
    }
}
