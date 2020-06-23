package com.fh;

import com.fh.utils.EnumResult;
import com.fh.utils.ResponseServer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Component
public class InterfaseApiImpl implements InterfaseApi{
    @Override
    public Map<String, Object> queryList( Long page, Long limit) {
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",2222);
        resultMap.put("message","已对品牌微服务进行熔断处理");
        resultMap.put("data",null);
        return resultMap;
    }

    @Override
    public ResponseServer deleteBrand(Integer id) {
        return ResponseServer.error(EnumResult.ERROR);
    }
}
