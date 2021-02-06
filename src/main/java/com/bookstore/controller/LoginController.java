package com.bookstore.controller;

import com.bookstore.enity.User;
import com.bookstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/tologin")
    public String toLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(String account, String password, String identify,
                        HttpSession session, HttpServletRequest request) {
        boolean result = userService.login(account, password);
        if (result) {
            User user = userService.getUser(account);
            session.setAttribute("user", user);
            System.out.println("成功");
            return "redirect:/home";
        } else {
            request.setAttribute("error", "账号或密码错误");
            System.out.println("失败");
            return "login";
        }
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/home";
    }
}
