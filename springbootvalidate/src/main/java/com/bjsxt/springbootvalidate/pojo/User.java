package com.bjsxt.springbootvalidate.pojo;

public class User {
    private Integer userid;
    private String username;
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
