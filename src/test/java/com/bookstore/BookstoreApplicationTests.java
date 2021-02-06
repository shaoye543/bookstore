package com.bookstore;

import com.bookstore.common.PriceKeywords;
import com.bookstore.enity.Book;
import com.bookstore.mapper.BookMapper;
import com.bookstore.service.BookService;
import com.bookstore.service.CategoryService;
import com.bookstore.util.Constant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

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
        List<Book> books = bookService.getBooksByKeywords(null, 0, 0, 0);
        for (Book book : books)
            System.out.println(book.toString());
    }

}
