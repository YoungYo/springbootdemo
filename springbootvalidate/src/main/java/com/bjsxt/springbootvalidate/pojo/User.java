package com.bjsxt.springbootvalidate.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @NotNull 对引用类型做非空校验
 * @NotBlank 对字符串类型做非空校验
 * @NotEmpty 对集合类型做非空校验
 * @author 王浩
 */
public class User {
    @NotNull(message = "用户ID不能为空")
    private Integer userid;
    @NotBlank(message = "用户姓名不能为空")
    private String username;
    @NotBlank(message = "用户性别不能为空")
    private String userGender;

    public User() {
    }

    public User(Integer userid, String username, String userGender) {
        this.userid = userid;
        this.username = username;
        this.userGender = userGender;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userGender='" + userGender + '\'' +
                '}';
    }
}
