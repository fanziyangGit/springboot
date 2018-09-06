package com.fzy.springboot.service.impl;

import com.fzy.springboot.mapper.UserMapper;
import com.fzy.springboot.pojo.User;
import com.fzy.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper usermapper;
    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return usermapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) { return usermapper.insert(record);}

    @Override
    public int insertSelective(User record) {
        return usermapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return usermapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return usermapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) { return usermapper.updateByPrimaryKey(record);  }
}
