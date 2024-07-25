package com.example.controller;

import com.example.dao.UserMapper;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author yull
 * @date 2024-07-24 0:09
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public String test(String name){
        User entity = new User();
        entity.setName("zhangsan");
        entity.setEmail("111@qq.com");
        entity.setAge(36);
        entity.setIdDelete(0);
        entity.setCreateBy("admin");
        entity.setCreateTime(LocalDateTime.now());
        userMapper.insert(entity);
        return name;
    }



}
