package com.example.demo.service.impl;

import com.example.demo.Request.RequestUser;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户管理业务层
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 添加用户
     * @param requestUser
     */
    @Override
    @Transactional
    public void addUser(RequestUser requestUser) {
        this.userDao.insertUsers(requestUser);
    }
}
