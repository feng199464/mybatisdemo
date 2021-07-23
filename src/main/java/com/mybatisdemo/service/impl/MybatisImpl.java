package com.mybatisdemo.service.impl;

import com.mybatisdemo.dao.MybatisMapper;
import com.mybatisdemo.service.IMybatisDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class MybatisImpl implements IMybatisDemoService {


    @Autowired
    private MybatisMapper mybatisMapper;

    @Override
    public List<Map<String, Object>> selectList() {
        return mybatisMapper.selectList();
    }
}
