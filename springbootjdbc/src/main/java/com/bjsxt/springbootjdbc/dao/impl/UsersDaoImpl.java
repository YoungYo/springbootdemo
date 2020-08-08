package com.bjsxt.springbootjdbc.dao.impl;

import com.bjsxt.springbootjdbc.dao.UsersDao;
import com.bjsxt.springbootjdbc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author wanghao
 */
@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUsers(Users users) {
        String sql = "insert into users(username, user_gender) values(?, ?)";
        jdbcTemplate.update(sql, users.getUsername(), users.getUserGender());
    }

    @Override
    public List<Users> selectAllUsers() {
        String sql = "select * from users";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            Users users = new Users();
            users.setUserid(resultSet.getInt("userid"));
            users.setUsername(resultSet.getString("username"));
            users.setUserGender(resultSet.getString("user_gender"));
            return users;
        });
    }

    @Override
    public Users selectUserById(Integer id) {
        String sql = "select * from users where userid=?";
        Users users = new Users();
        jdbcTemplate.query(sql, new Object[]{id}, resultSet -> {
            users.setUserid(resultSet.getInt("userid"));
            users.setUsername(resultSet.getString("username"));
            users.setUserGender(resultSet.getString("user_gender"));
        });
        return users;
    }

    @Override
    public void updateUser(Users user) {
        String sql = "update users set username=?, user_gender=? where userid=?";
        jdbcTemplate.update(sql, user.getUsername(), user.getUserGender(), user.getUserid());
    }
}
