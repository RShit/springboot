package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){

        return "helloWorld";
    }

    @RequestMapping("hello1")
    public String hello1(){

        return "helloWorld1";
    }
}
