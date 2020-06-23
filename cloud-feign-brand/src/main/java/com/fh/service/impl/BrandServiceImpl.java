package com.fh.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.bean.Brand;
import com.fh.mapper.BrandMapper;
import com.fh.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Map<String, Object> queryList(Long page,Long limit) {
        Map<String, Object> map=new HashMap<>();
        Page<Brand> p=new Page<>(page,limit);
        IPage<Brand> brandIPage = brandMapper.selectPage(p, null);
        map.put("page",brandIPage);
        return map;
    }

    @Override
    public void deleteBrand(Integer id) {
        brandMapper.deleteById(id);
    }
}
