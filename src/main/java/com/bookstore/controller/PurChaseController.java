package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PurChaseController {


    @ResponseBody
    @RequestMapping("/purchase/{number}")
    public String purchaseBook(@PathVariable("number") Integer number) {
        return String.valueOf(number);
    }

}
