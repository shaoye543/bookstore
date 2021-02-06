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


    //获取所有书籍信息
    public List<Book> getAllBooks();


    //按关键字检索    这里的pricetype代表的是一定的价格区间 同样的ordertype代表一种排序方式
    public List<Book> getBooksByKeywords(@Param("searchkey") String searchkey, @Param("categoryid") Integer categoryid, Integer pricetype,
                                         Integer ordertype);

    //按销售量   参数同上 这里未有ordertype因为涉及到另外一张表
    public List<Book> getBooksByConsum(@Param("searchkey") String searchkey, @Param("categoryid") Integer categoryid, Integer pricetype);

    //按书籍编号查询书籍信息
    public Book getBooksById(Integer bookid);
}
