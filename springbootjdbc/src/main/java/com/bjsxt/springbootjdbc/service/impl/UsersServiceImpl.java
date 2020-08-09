package com.bjsxt.springbootjdbc.service.impl;

import com.bjsxt.springbootjdbc.dao.UsersDao;
import com.bjsxt.springbootjdbc.pojo.Users;
import com.bjsxt.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wanghao
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional
    public void addUser(Users users) {
        usersDao.insertUsers(users);
    }

    @Override
    public List<Users> getAllUser() {
        return usersDao.selectAllUsers();
    }

    @Override
    public Users getUserById(Integer id) {
        return usersDao.selectUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(Users user) {
        usersDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        usersDao.deleteUserById(id);
    }
}
