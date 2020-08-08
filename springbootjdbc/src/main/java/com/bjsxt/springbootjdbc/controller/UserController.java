package com.bjsxt.springbootjdbc.controller;

import com.bjsxt.springbootjdbc.pojo.Users;
import com.bjsxt.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
            //如果报错，跳转到失败页面
            return "error";
        }
        //如果成功，跳转到添加用户的页面
        return "addUser";
    }

    /**
     * 获取所有用户
     * @return
     */
    @RequestMapping("getAllUser")
    public String getAllUser(Model model) {
        try {
            List<Users> allUser = usersService.getAllUser();
            model.addAttribute("list", allUser);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "showUsers";
    }
}
