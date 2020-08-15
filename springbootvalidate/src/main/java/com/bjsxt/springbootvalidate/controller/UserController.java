package com.bjsxt.springbootvalidate.controller;

import com.bjsxt.springbootvalidate.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("addUserPage")
    public String addUserPage() {
        return "addUser";
    }

    @RequestMapping("addUser")
    public String addUser(User user) {
        System.out.println(user);
        return "ok";
    }
}
