package com.example.springboot.service;

import com.example.springboot.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<String> selectPermissionByUserId(Long userId);
    SysUser findByUserName(String userName);
}
