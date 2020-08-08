package com.bjsxt.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("testDataSource")
    @ResponseBody
    public String hello() {
        System.out.println(dataSource.getClass().getPackage());
        return "hello";
    }
}
