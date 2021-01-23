package com.bookstore.service;


import com.bookstore.enity.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    /**
     * 获取所有书籍类型
     * @return
     */
    public List<Category> getAllCategory();

    /**
     * 只获取9中类型展示
     * @return
     */
    public List<String> getCategoryLimitNine();

}
