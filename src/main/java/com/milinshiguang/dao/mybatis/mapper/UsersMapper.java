package com.milinshiguang.dao.mybatis.mapper;

import com.milinshiguang.entity.Users;
import com.milinshiguang.entity.UsersKey;

public interface UsersMapper {
    int deleteByPrimaryKey(UsersKey key);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(UsersKey key);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}