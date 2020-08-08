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

    /**
     * 根据ID获取用户信息
     * @param id 用户ID
     * @return Users对象
     */
    Users getUserById(Integer id);

    /**
     * 更新用户信息
     * @param user Users对象
     */
    void updateUser(Users user);
}
