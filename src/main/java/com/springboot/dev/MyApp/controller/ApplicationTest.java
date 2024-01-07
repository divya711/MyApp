package com.springboot.dev.MyApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationTest {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
