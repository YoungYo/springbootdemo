package com.bjsxt.springbootmybatis.mapper;

import com.bjsxt.springbootmybatis.pojo.UserPojo;
import com.bjsxt.springbootmybatis.pojo.UserPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPojoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    UserPojo selectByPrimaryKey(Integer userid);

    List<UserPojo> selectAllUser();

    int updateByExampleSelective(@Param("record") UserPojo record, @Param("example") UserPojoExample example);

    int updateByExample(@Param("record") UserPojo record, @Param("example") UserPojoExample example);

    int updateByPrimaryKeySelective(UserPojo record);

    int updateByPrimaryKey(UserPojo record);
}