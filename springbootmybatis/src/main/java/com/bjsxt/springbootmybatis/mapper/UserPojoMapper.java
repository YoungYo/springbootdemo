package com.bjsxt.springbootmybatis.mapper;

import com.bjsxt.springbootmybatis.pojo.UserPojo;
import com.bjsxt.springbootmybatis.pojo.UserPojoExample;
import org.apache.ibatis.annotations.Param;

public interface UserPojoMapper {
    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    int updateByExampleSelective(@Param("record") UserPojo record, @Param("example") UserPojoExample example);

    int updateByExample(@Param("record") UserPojo record, @Param("example") UserPojoExample example);
}