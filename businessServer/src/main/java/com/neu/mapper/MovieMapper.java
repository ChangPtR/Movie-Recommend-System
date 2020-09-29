package com.neu.mapper;

import com.neu.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MovieMapper {
    public List<Movie> listAll(Map<String, Integer> mp);
    public List<Movie> search(Map<String, Object> mp);
}
