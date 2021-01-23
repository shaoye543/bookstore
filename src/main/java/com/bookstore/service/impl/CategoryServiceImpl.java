package com.bookstore.service.impl;

import com.bookstore.enity.Book;
import com.bookstore.enity.Category;
import com.bookstore.mapper.CategoryMapper;
import com.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAllCategory() {
        return categoryMapper.getAllCategory();
    }

    @Override
    public List<String> getCategoryLimitNine() {
        return categoryMapper.getCategoryLimitNine();
    }

}
