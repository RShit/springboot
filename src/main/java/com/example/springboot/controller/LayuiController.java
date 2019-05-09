package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/layui")
public class LayuiController {
    @RequestMapping("/index")
    public String index(){
        return "layui/index";
    }
}
