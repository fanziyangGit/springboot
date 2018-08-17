package com.fzy.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Value("${name}")
    private String name;
    /**
     *
     */
    @Value("${age}")
    private String age;

    @RequestMapping("/hello2")
    /* @ResponseBody */
    public String toIndex() {
        final String s = "HELLO WORLD5555";
        return "hello";

    }

    ;
}
