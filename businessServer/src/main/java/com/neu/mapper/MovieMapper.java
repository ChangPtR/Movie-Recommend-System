package com.neu.mapper;

import com.neu.dto.PageDto;
import com.neu.model.Movie;
import com.neu.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MovieMapper {
    public List<Movie> listAll(Map<String, Integer> mp);
    public List<Movie> search(Map<String, Object> mp);
    public Movie getOne(Movie movie);
    public Integer getCount(Movie movie);
    public List<Map<String,Object>> currCount(Map<String,Integer> mp);
    public Double getAvg(Movie movie);
    public List<Map<String,Object>> top10(String genre);
    public List<Map<String,Object>> userRecommend(User user);
}
