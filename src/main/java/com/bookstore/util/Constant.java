package com.bookstore.util;

import org.springframework.ui.ModelMap;

import java.util.Map;

public class Constant {

    public static void test(int a) {
        a = 2;
    }

    public static void judgeAndSetAttribute(Integer key, Map<String, String> params, ModelMap model) {
//        String temp = String.valueOf(key);
//        if (!params.containsKey(key) || params.get(key).equals("0") || params.get(key) == null) {
//            model.addAttribute(key, 0);
//        } else {
//            key = params.get(temp);
//            model.addAttribute(temp, key);
//        }
    }
}
