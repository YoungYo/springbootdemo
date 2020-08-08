package com.bjsxt.springbootjdbc.service;

import com.bjsxt.springbootjdbc.pojo.Users;

import java.util.List;

/**
 * 用户管理业务层
 * @author wanghao
 */
public interface UsersService {
    /**
     * 添加用户
     * @param users Users 对象
     */
    void addUser(Users users);

    /**
     * 获取所有的用户
     * @return Users对象集合
     */
    List<Users> getAllUser();
}
