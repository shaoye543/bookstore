package com.bookstore.service.impl;

import com.bookstore.enity.User;
import com.bookstore.mapper.UserMapper;
import com.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(String account, String password) {
        String pass = userMapper.getPassword(account);
        return pass != null && pass.equals(password);
    }

    @Override
    public User getUser(String account) {
        return userMapper.getUserByAccount(account);
    }
}
