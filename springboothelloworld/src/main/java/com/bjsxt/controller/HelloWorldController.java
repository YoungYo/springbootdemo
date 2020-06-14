package com.bjsxt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 注解是 @Controller 和 @ResponseBody 的复合体，
 * 加上这个注解，表示该类下面的所有接口都不做页面的跳转，而是直接返回字符串
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String showHelloWorld(){
        return "HelloWorld";
    }
}
