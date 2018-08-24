package com.milinshiguang.controller;

import com.milinshiguang.dao.mybatis.mapper.JobMapper;
import com.milinshiguang.entity.Job;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author lizhen
 * @date 2018/8/24 15:18
 */
@RestController
public class JobController {

    @Resource
    private JobMapper jobMapper;

    @RequestMapping("/job")
    public Map<String, Object> selectByPrimaryKey (@RequestParam Job job) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            List<Job> list = this.jobMapper.selectByPrimaryKey(job.getId());
            result.put("success", true);
            result.put("rows", list);
        } catch (Exception e) {
            result.put("success", false);
            result.put("rows", new ArrayList<Job>());
            e.printStackTrace();
        }
        return result;
    }

}
