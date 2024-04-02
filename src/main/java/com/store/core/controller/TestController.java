package com.store.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1/{userName}")
    public String test1(@PathVariable String userName){
        System.out.println("Hello from console");
        return "Welcome " + userName;
    }



}
