package com.bookstore.mapper;

import com.bookstore.enity.Press;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PressMapper {

    //获取出版社名称
    public Press getPressById(Integer pressid);

}
