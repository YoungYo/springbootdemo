package com.bjsxt.springbootjdbc.service;

import com.bjsxt.springbootjdbc.pojo.Users;

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
}
