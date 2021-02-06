package com.bookstore.controller;

import com.bookstore.common.OrderKeywords;
import com.bookstore.common.PriceKeywords;
import com.bookstore.enity.Book;
import com.bookstore.enity.Category;
import com.bookstore.mapper.BookMapper;
import com.bookstore.service.BookService;
import com.bookstore.service.CategoryService;
import com.bookstore.service.PressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class BookIndexController {
    @Resource
    private CategoryService categoryService;
    @Resource
    private BookService bookService;
    @Resource
    private PressService pressService;

//
//    //这俩其实可以放一块
//    @RequestMapping(value = {"/index", "/search"})
//    public String bookIndex(@RequestParam(value = "page", required = true, defaultValue = "1") Integer page,
//                            Map<String, Object> params, ModelMap model) {
//
//        List<Category> categories = categoryService.getAllCategory();     //获取所有书籍类型
//
//        PageHelper.startPage(page, 10);                        //每页展示20本书籍
//        List<Book> books = bookService.getAllBooks();           //获取全部书籍信息
//        PageInfo<Book> pageInfo = new PageInfo<Book>(books);
//        model.addAttribute("categories", categories);
//        model.addAttribute("pageinfo", pageInfo);
//        model.addAttribute("price_area_info", PriceKeywords.values());
//        model.addAttribute("book_order_info", OrderKeywords.values());
//        model.addAttribute("order", 0);
//        model.addAttribute("price", 0);
//        model.addAttribute("type", 0);
//        model.addAttribute("searchkey", null);
//        return "store/index";
//    }

    @RequestMapping(value = {"/index", "/search"})
    public String bookSearch(@RequestParam Map<String, String> params, ModelMap model,
                             @RequestParam(value = "page", required = true, defaultValue = "1") Integer page) {

        Integer id = null;                //书籍种类
        Integer price = null;              //价格区间
        Integer order = null;              //排序方式
        String searchkey = null;          //搜索的关键字
        //书籍类型属性 供前端回显
        if (!params.containsKey("category") || params.get("category").isEmpty()) {
            model.addAttribute("type", 0);
        } else {
            id = Integer.parseInt(params.get("category"));
            model.addAttribute("type", id);
        }
        //价格区间属性 供前端回显
        if (!params.containsKey("price") || params.get("price").isEmpty()) {
            model.addAttribute("price", 0);
        } else {
            price = PriceKeywords.getIdByValue(params.get("price"));
            model.addAttribute("price", price);
        }
        //排序选择 供前端回显
        if (!params.containsKey("order") || params.get("order").isEmpty()) {
            model.addAttribute("order", 0);
        } else {
            order = OrderKeywords.getIdByValue(params.get("order"));
            model.addAttribute("order", order);
        }
        //搜索关键字  爱要要 有没有无所谓
        if (!params.containsKey("searchkey") || params.get("searchkey").isEmpty()) {
            model.addAttribute("searchkey", null);
        } else {
            searchkey = params.get("searchkey");
            model.addAttribute("searchkey", searchkey);
        }

        List<Category> categories = categoryService.getAllCategory();     //获取所有书籍类型


        PageHelper.startPage(page, 20);                          //每页展示20本书籍
        List<Book> books = bookService.getBooksByKeywords(searchkey, id, price, order);             //按类别查询的书籍
        PageInfo<Book> pageInfo = new PageInfo<Book>(books);
        model.addAttribute("price_area_info", PriceKeywords.values());    //排序种类
        model.addAttribute("book_order_info", OrderKeywords.values());    //价格区间
        model.addAttribute("categories", categories);                //所有的书籍类型
        model.addAttribute("pageinfo", pageInfo);
        return "store/index";
    }

    @RequestMapping(value = "/book/{bookid}")
    public String bookDetailInfo(@PathVariable("bookid") Integer bookid, ModelMap model) {
        Book book = bookService.getBooksById(bookid);                    //书籍信息
        String pressname = pressService.getPressnameById(book.getPressid());   //书籍的出版社名
        model.addAttribute("book", book);
        model.addAttribute("press", pressname);
        return "store/book";
    }
}
