package com.fzy.springboot.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.fzy.springboot.dao")
public class SpringbootApplication {

    public static void main(String[] args) {

         ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);

    }
}
