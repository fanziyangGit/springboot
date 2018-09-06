package com.fzy.springboot;

import com.fzy.springboot.mapper.UserMapper;
import com.fzy.springboot.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setPassword("123456");
        user.setPhone("12345678910");
        user.setUserName("winterchen");
        userMapper.insert(user);

    }

}
