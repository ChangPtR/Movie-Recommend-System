package com.neu.service;

import com.neu.mapper.OccupationMapper;
import com.neu.model.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationService {
    @Autowired
    private OccupationMapper occupationMapper;

    public List<Occupation> list(){
        return occupationMapper.list();
    }
}
