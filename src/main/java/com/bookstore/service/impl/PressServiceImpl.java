package com.bookstore.service.impl;

import com.bookstore.enity.Press;
import com.bookstore.mapper.PressMapper;
import com.bookstore.service.PressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PressServiceImpl implements PressService {
    @Autowired
    private PressMapper pressMapper;

    @Override
    public String getPressnameById(Integer pressid) {
        Press press = pressMapper.getPressById(pressid);
        return press.getPressname();
    }
}
