package com.bjsxt.springbootmybatis.mapper;

import com.bjsxt.springbootmybatis.pojo.UserPojo;

import java.util.List;

public interface UserPojoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    UserPojo selectByPrimaryKey(Integer userid);

    List<UserPojo> selectAllUser();

    int updateByPrimaryKeySelective(UserPojo record);

    int updateByPrimaryKey(UserPojo record);
}