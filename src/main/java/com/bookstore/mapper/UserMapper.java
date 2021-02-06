package com.bookstore.mapper;

import com.bookstore.enity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public User getUserByAccount(String account);

    public String getPassword(String account);

}
