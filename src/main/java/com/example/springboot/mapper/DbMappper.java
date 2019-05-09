package com.example.springboot.mapper;

import com.example.springboot.dto.VocabListDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DbMappper {
    List<VocabListDTO> selectAllData();
}
