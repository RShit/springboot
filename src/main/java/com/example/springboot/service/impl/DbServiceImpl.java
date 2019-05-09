package com.example.springboot.service.impl;

import com.example.springboot.dto.VocabListDTO;
import com.example.springboot.mapper.DbMappper;
import com.example.springboot.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbServiceImpl implements DbService {

    @Autowired
    private DbMappper dbMappper;

    @Override
    public List<VocabListDTO> getAllData() {
        List<VocabListDTO> allData = dbMappper.selectAllData();
        return allData;
    }
}
