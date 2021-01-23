package com.bookstore;

import com.bookstore.common.PriceKeywords;
import com.bookstore.mapper.BookMapper;
import com.bookstore.service.BookService;
import com.bookstore.service.CategoryService;
import com.bookstore.util.Constant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;

@SpringBootTest
class BookstoreApplicationTests {

    @Autowired
    CategoryService categoryService;

    @Autowired
    BookService bookService;

    @Resource
    BookMapper bookMapper;

    @Test
    void contextLoads() throws SQLException {
        String test = "";
//        System.out.println(TestEnum.ALL_TYPE.);
        if ("".equals(test))
            System.out.println("dsa");

    }

}
