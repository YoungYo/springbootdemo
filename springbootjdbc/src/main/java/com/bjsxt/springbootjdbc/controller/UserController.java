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

    /**
     * 预更新用户查询
     * @param id 用户ID
     * @return 视图文件名
     */
    @RequestMapping("preUpdateUser")
    public String perUpdateUser(Integer id, Model model) {
        try {
            Users users = usersService.getUserById(id);
            model.addAttribute("user", users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }

    /**
     * 更新用户信息
     * @param users Users对象
     * @return 视图文件名
     */
    @RequestMapping("updateUser")
    public String updateUser(Users users) {
        try {
            usersService.updateUser(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }

    /**
     * 根据ID删除用户
     * @param id 用户ID
     * @return 视图文件名
     */
    @RequestMapping("deleteUser")
    public String deleteUser(Integer id) {
        try {
            usersService.deleteUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }
}
