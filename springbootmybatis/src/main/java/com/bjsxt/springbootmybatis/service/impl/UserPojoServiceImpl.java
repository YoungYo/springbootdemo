package com.bjsxt.springbootmybatis.service.impl;

import com.bjsxt.springbootmybatis.mapper.UserPojoMapper;
import com.bjsxt.springbootmybatis.pojo.UserPojo;
import com.bjsxt.springbootmybatis.service.UserPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wanghao
 */
@Service
public class UserPojoServiceImpl implements UserPojoService {
    @Autowired
    private UserPojoMapper userPojoMapper;

    @Override
    @Transactional
    public void addUser(UserPojo users) {
        userPojoMapper.insertSelective(users);
    }

    @Override
    public List<UserPojo> getAllUser() {
        return userPojoMapper.selectAllUser();
    }
//
//    @Override
//    public UserPojo getUserById(Integer id) {
//        return userPojoMapper.selectUserById(id);
//    }
//
//    @Override
//    @Transactional
//    public void updateUser(UserPojo user) {
//        userPojoMapper.updateUser(user);
//    }
//
//    @Override
//    @Transactional
//    public void deleteUser(Integer id) {
//        userPojoMapper.deleteUserById(id);
//    }
}
