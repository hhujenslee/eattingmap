package com.milinshiguang.service;

import com.milinshiguang.dao.mybatis.mapper.JobMapper;
import com.milinshiguang.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author lizhen
 * @date 2018/8/27 10:25
 */
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Job job){
           return jobMapper.insert(job);
    }

    @Override
    public int insertSelective(Job record) {
        return insertSelective(record);
    }

    @Override
    public List<Job> selectByPrimaryKey(Integer id) {
        return jobMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Job record) {
        return jobMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Job record) {
        return updateByPrimaryKey(record);
    }
}
