package com.bookstore.mapper;

import com.bookstore.enity.Book;
import com.bookstore.enity.Category;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CategoryMapper {

    //获取前9个图书种类
    public List<String> getCategoryLimitNine();

    //获取所有的图书种类
    public List<Category> getAllCategory();


}
