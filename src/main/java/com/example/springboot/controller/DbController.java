package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dto.VocabListDTO;
import com.example.springboot.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DbService dbService;

    @RequestMapping("/getProjectHtml")
    public String getProjectHtml(){
        return "html/index.html";
    }

    @RequestMapping("/getProject")
    public String getProject(){
        List<VocabListDTO> allData = dbService.getAllData();

        return JSON.toJSONString(allData);
    }
}
