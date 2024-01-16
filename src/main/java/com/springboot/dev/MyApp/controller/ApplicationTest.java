package com.springboot.dev.MyApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationTest {

    @Value("${team.name}")
    private String teamName;

    @Value("${team.details}")
    private String teamDescription;

    @GetMapping("/teamInfo")
    public String teamDetails(){
        return teamName +" is team of " +teamDescription;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

}
