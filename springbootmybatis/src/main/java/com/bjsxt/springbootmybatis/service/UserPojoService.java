package com.bjsxt.springbootmybatis.service;

import com.bjsxt.springbootmybatis.pojo.UserPojo;

import java.util.List;

/**
 * 用户管理业务层
 * @author wanghao
 */
public interface UserPojoService {
    /**
     * 添加用户
     * @param users UserPojo 对象
     */
    void addUser(UserPojo users);

    /**
     * 获取所有的用户
     * @return UserPojo对象集合
     */
    List<UserPojo> getAllUser();

    /**
     * 根据ID获取用户信息
     * @param id 用户ID
     * @return UserPojo对象
     */
    UserPojo getUserById(Integer id);

    /**
     * 更新用户信息
     * @param user UserPojo对象
     */
    void updateUser(UserPojo user);

    /**
     * 根据ID删除用户
     * @param id 用户ID
     */
    void deleteUser(Integer id);
}
