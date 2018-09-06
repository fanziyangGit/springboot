package com.fzy.springboot.mapper;

import com.fzy.springboot.pojo.User;

public interface UserMapper {
    int insertSelective(User record);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}