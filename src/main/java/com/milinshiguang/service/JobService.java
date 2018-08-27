package com.milinshiguang.service;

import com.milinshiguang.entity.Job;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lizhen
 * @date 2018/8/27 10:24
 */
@Service
public interface JobService {
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}
