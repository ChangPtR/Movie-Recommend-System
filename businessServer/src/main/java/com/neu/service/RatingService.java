package com.neu.service;

import com.neu.mapper.RatingMapper;
import com.neu.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RatingService {

    @Autowired
    private RatingMapper ratingMapper;
    public Rating find(Map<String,Integer> mp){
        return ratingMapper.find(mp);
    }
    public int add(Rating rating){
        return ratingMapper.add(rating);
    }
    public int update(Rating rating){
        return ratingMapper.update(rating);
    }
}
