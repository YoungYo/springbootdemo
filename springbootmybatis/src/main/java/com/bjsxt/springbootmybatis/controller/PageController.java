package com.bjsxt.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanghao
 */
@Controller
public class PageController {
    /**
     * 页面跳转方法
     */
    @RequestMapping("addUser")
    public String addUserPage() {
        return "addUser";
    }
}
