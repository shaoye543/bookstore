package com.bookstore.service;

import com.bookstore.enity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getNewBooks();

    public List<Book> getBestSalesBooks();

    public List<Book> getAllBooks();

    public List<Book> getBooksByKeywords(String searchkey, Integer categoryid, Integer price, Integer order);

    public Book getBooksById(Integer bookid);

}
