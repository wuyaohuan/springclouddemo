package com.fh.service;

import java.util.Map;

public interface BrandService {

    Map<String, Object> queryList(Long page,Long limit);

    void deleteBrand(Integer id);
}
