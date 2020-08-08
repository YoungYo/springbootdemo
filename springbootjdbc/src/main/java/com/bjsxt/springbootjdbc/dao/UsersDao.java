package com.bjsxt.springbootjdbc.dao;

import com.bjsxt.springbootjdbc.pojo.Users;

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
}
