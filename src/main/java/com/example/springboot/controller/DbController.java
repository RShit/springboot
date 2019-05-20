package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dto.VocabListDTO;
import com.example.springboot.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liuyy
 * @date 2019年5月7日16:16:08
 * 数据库测试
 */
@Controller
@RequestMapping("/db")
public class DbController {

    @Autowired
    private DbService dbService;

    @RequestMapping("/getProjectHtml")
    public String getProjectHtml(){
        return "index";
    }

    @RequestMapping("/getProject")
    @ResponseBody
    public String getProject(){
        List<VocabListDTO> allData = dbService.getAllData();

        return JSON.toJSONString(allData);
    }
}
