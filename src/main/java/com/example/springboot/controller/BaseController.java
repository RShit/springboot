package com.example.springboot.controller;

import com.example.springboot.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * @author liuyy
 * @className BaseController
 * @description TODO
 * @date 2019/5/21 17:12
 **/
public class BaseController {
    public SysUser getCurrentUser() {
        SysUser user = null;
        Subject subject = SecurityUtils.getSubject();
        if (subject != null && subject.isAuthenticated()) {
            user = (SysUser) subject.getPrincipal();
        }
        return user;
    }
}
