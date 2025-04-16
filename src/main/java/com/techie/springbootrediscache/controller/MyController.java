package com.techie.springbootrediscache.controller;

import com.techie.springbootrediscache.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("redis/v1.0/data")
    public String getData(@RequestParam String input) {
        System.out.println("Value being inserted into Redis : " + input);
        return myService.getData(input);
    }
}
