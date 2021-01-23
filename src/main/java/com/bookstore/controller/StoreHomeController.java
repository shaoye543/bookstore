package com.bookstore.controller;


import com.bookstore.enity.Book;
import com.bookstore.service.BookService;
import com.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class StoreHomeController {


    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = {"/home", "/", "home.html"})
    public String storeHome(ModelMap model) {
        List<String> categories = categoryService.getCategoryLimitNine();
        List<Book> books = bookService.getNewBooks();
        List<Book> bestsales = bookService.getBestSalesBooks();
        model.addAttribute("categories", categories);
        model.addAttribute("books", books);
        model.addAttribute("bestsales", bestsales);
        return "store/home";
    }

}
