package com.fzy.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

    @Value("${name}")
    private String name;
    /**
     *
     */
    @Value("${age}")
    private String age;

    @RequestMapping("/hello")
    /* @ResponseBody */
    public String toIndex() {
        final String s = "HELLO WORLD5555";
        return "hello";
    }

    ;
}
