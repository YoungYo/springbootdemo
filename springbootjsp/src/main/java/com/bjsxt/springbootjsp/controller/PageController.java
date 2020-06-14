package com.bjsxt.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 页面跳转 Controller
 */
@Controller
public class PageController {
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}