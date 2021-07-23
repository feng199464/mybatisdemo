package com.mybatisdemo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MybatisMapper {



    public List<Map<String, Object>> selectList();

}
