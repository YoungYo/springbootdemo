package com.bjsxt.springbootjdbc.controller;

import com.bjsxt.springbootjdbc.pojo.Users;
import com.bjsxt.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

/**
 * @author wanghao
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;

    /**
     * 添加用户
     * @return
     */
    @RequestMapping("addUser")
    public String addUser(Users users) {
        try {
            usersService.addUser(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "operateUser";
    }
}
