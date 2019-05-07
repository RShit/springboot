package com.example.springboot.mapper;

import com.example.springboot.dto.VocabListDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbMappper {
    List<VocabListDTO> getAllData();
}
