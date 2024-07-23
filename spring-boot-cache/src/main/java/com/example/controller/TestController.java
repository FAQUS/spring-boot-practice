package com.example.controller;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yull
 * @date 2024-07-24 0:09
 */
@RestController
public class TestController {

    @GetMapping("/test")
    @Cacheable(value = "test", key = "#name")
    public String test(String name){
        System.out.println("name = " + name);
        return name;
    }

    @GetMapping("/test2")
    @CachePut(value = "test", key = "#name")
    public String test2(String name){
        System.out.println("name = " + name);
        return name;
    }

}
