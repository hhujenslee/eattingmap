package com.milinshiguang.dao.mybatis.mapper;

import com.milinshiguang.entity.Job;

import java.util.List;

public interface JobMapper<Job> {
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}