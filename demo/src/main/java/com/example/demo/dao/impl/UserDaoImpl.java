package com.example.demo.dao.impl;

import com.example.demo.Request.RequestUser;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 持久层
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加用户
     * @param requestUser
     */
    @Override
    public void insertUsers(RequestUser requestUser) {
        String sql = "insert into  users(username , usersex) values (?,?)";

        this.jdbcTemplate.update(sql,requestUser.getUsername(),requestUser.getUsersex());
    }
}
