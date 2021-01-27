package com.bookstore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BookStoreWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //静态资源
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //图片     url位置    实际存储位置
        registry.addResourceHandler("/image/**").addResourceLocations("file:D:/upload/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/error/404").setViewName("/error/404.html");
    }
}
