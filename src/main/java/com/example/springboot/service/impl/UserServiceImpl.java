package com.example.springboot.service.impl;

import com.example.springboot.entity.SysUser;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<String> selectPermissionByUserId(Long userId) {
        List<String> stringList = userMapper.selectPermissionByUserId(userId);
        return stringList;
    }

    @Override
    public SysUser findByUserName(String userName) {
        SysUser byUserName = userMapper.findByUserName(userName);

        return byUserName;
    }
}
