package com.example.springboot.mapper;

import com.example.springboot.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<String> selectPermissionByUserId(Long userId);
    SysUser findByUserName(String userName);
}
