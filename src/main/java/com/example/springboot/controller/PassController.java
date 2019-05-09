package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dto.LoginDTO;
import com.example.springboot.dto.ReturnJSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PassController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/dologin")
    @ResponseBody
    public String dologin(LoginDTO loginDTO, HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) throws IOException {

        System.out.println(loginDTO.toString());
        ReturnJSON returnJSON = new ReturnJSON();
        if ("user1".equals(loginDTO.getUserName()) && "123456".equals(loginDTO.getPassword())) {
            returnJSON.setFlag(true);
            returnJSON.setMsg("登陆成功");
        }else {
            returnJSON.setFlag(false);
            returnJSON.setMsg("密码错误");
        }
        return JSON.toJSONString(returnJSON);
    }
}
