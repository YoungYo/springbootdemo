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
}
