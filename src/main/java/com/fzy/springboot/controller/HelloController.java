package com.fzy.springboot.controller;


import com.fzy.springboot.pojo.User;
import com.fzy.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping(value = "/user")
public class HelloController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.insert(user);
    }

    @RequestMapping(value = "/add2")
    public String addUser2(){ return "fanziyang";}
}
