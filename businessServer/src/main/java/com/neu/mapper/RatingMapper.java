package com.neu.mapper;

import com.neu.model.Rating;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface RatingMapper {
    public Rating find(Map<String,Integer> mp);
    public int add(Rating rating);
    public int update(Rating rating);
}
