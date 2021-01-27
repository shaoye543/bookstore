package com.bookstore.service.impl;

import com.bookstore.enity.Book;
import com.bookstore.mapper.BookMapper;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getNewBooks() {
        return bookMapper.getNewBooks();
    }

    @Override
    public List<Book> getBestSalesBooks() {
        return bookMapper.getBestSalesBooks();
    }


    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public List<Book> getBooksByKeywords(String searchkey, Integer categoryid, Integer price, Integer order) {
        //order为1时代表按销售量排序 但是不好在一个查询中一起使用 单独拎出来
        if (order == null) return bookMapper.getBooksByKeywords(searchkey, categoryid, price, order);
        else if (1 == order)
            return bookMapper.getBooksByConsum(searchkey, categoryid, price);
        else
            return bookMapper.getBooksByKeywords(searchkey, categoryid, price, order);
    }

    @Override
    public Book getBooksById(Integer bookid) {
        return bookMapper.getBooksById(bookid);
    }
}
