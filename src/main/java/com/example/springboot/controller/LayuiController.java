package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyy
 * @date 2019年5月7日16:17:00
 * layui测试
 */
@Controller
@RequestMapping("/layui")
public class LayuiController {
    @RequestMapping("/index")
    public String index(){
        return "layui/index";
    }
}
