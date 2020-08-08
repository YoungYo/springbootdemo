package com.bjsxt.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UrlController {
    @GetMapping("urlDemo")
    public String urlDemo() {
        return "urlDemo";
    }

    @GetMapping("receiveRestfulParam/{id}")
    public String receiveRestfulParam(@PathVariable String id) {
        System.out.println(id);
        return "index";
    }
}
