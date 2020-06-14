package com.bjsxt.springbootfreemarker.pojo;

public class User {
    private String username;
    private String gender;
    private String age;

    public User(String username, String gender, String age) {
        this.username = username;
        this.gender = gender;
        this.age = age;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
