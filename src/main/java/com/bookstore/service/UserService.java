package com.bookstore.service;

import com.bookstore.enity.User;

public interface UserService {

    //登录判断
    public boolean login(String account, String password);
    public User getUser(String account);

}
