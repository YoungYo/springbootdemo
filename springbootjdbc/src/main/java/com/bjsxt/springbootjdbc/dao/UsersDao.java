package com.bjsxt.springbootjdbc.dao;

import com.bjsxt.springbootjdbc.pojo.Users;

import java.util.List;

/**
 * 持久层
 * @author wanghao
 */
public interface UsersDao {
    /**
     * 往数据库中插入一条用户记录
     * @param users
     */
    void insertUsers(Users users);

    /**
     * 从数据库中查询所有的用户记录
     * @return Users对象集合
     */
    List<Users> selectAllUsers();

    /**
     * 根据ID从数据库中查询用户记录
     * @param id 用户ID
     * @return Users对象
     */
    Users selectUserById(Integer id);

    /**
     * 根据ID更新数据库中的用户信息
     * @param user Users对象
     */
    void updateUser(Users user);
}
