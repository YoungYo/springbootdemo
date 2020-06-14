package com.bjsxt.springbootfreemarker.controller;

import com.bjsxt.springbootfreemarker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    /**
     * 处理请求，返回数据
     */
    @GetMapping("showUsers")
    public String showUsers(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Tom", "M", "23"));
        users.add(new User("Julia", "F", "24"));
        users.add(new User("Jack", "M", "25"));
        model.addAttribute("list", users);
        return "userList";
    }
}
