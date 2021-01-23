package com.bookstore.mapper;

import com.bookstore.enity.Book;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {

    //获取最新上架的10本书
    public List<Book> getNewBooks();

    //最近一个月卖的最好的8本书
    public List<Book> getBestSalesBooks();

    //根据类型获取书籍信息
    public List<Book> getBooksByCategory();

    //获取所有书籍信息
    public List<Book> getAllBooks();

    public List<Book> getBookByCategory(Integer categoryid);

    //按关键字检索 两个同属一个单元 为方便拆分为两个函数
    public List<Book> getBooksByKeywords(@Param("searchkey") String searchkey, @Param("categoryid") Integer categoryid, Integer price, Integer order);

    public List<Book> getBooksByConsum(@Param("searchkey") String searchkey, @Param("categoryid") Integer categoryid, Integer price);

}
