package com.neu.service;

import com.neu.dto.PageDto;
import com.neu.mapper.MovieMapper;
import com.neu.model.Movie;
import com.neu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {
    @Autowired
    private MovieMapper movieMapper;

    public void listAll(PageDto pageDto){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("start", pageDto.getPage()*pageDto.getSize());
        mp.put("length",pageDto.getSize());
        List<Movie> mvList=movieMapper.listAll(mp);
        pageDto.setList(mvList);
        pageDto.setTotal(mvList.size());
    }

    public List<Movie> search(Map<String, Object> mp){
        mp.put("key","%"+mp.get("key").toString()+"%");
        int size=Integer.parseInt(mp.get("size").toString());
        int page=Integer.parseInt(mp.get("page").toString());
        mp.put("start", size*page);
        mp.put("length",size);
        return movieMapper.search(mp);
    }

    public Movie getOne(Movie movie){
        return movieMapper.getOne(movie);
    }

    public int getCount(Movie movie){
        Integer t=movieMapper.getCount(movie);
        if(t!=null){
            return (int)t;
        }else{
          return 0;
        }
    }
    public List<Map<String,Object>> currCount(PageDto pageDto){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("start", pageDto.getPage()*pageDto.getSize());
        mp.put("length",pageDto.getSize());
        return movieMapper.currCount(mp);
    }
    public double getAvg(Movie movie){
        Double d=movieMapper.getAvg(movie);
        if(d!=null){
            return (double)d;
        }else{
            return 0;
        }
    }
    public List<Map<String,Object>> top10(String genre){
        System.out.println(genre);
        return movieMapper.top10(genre);
    }
    public List<Map<String,Object>> top10_history_count(PageDto pageDto){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("start", pageDto.getPage()*pageDto.getSize());
        mp.put("length",pageDto.getSize());
        return movieMapper.top10_history_count(mp);
    }
    public List<Map<String,Object>> top10_current_count(PageDto pageDto){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("start", pageDto.getPage()*pageDto.getSize());
        mp.put("length",pageDto.getSize());
        return movieMapper.top10_current_count(mp);
    }
    public List<Map<String,Object>> top10_rate(PageDto pageDto){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("start", pageDto.getPage()*pageDto.getSize());
        mp.put("length",pageDto.getSize());
        return movieMapper.top10_rate(mp);
    }
    public List<Map<String,Object>> userRecommend(User user){
        return movieMapper.userRecommend(user);
    }
    public List<Map<String,Object>> contRecommend(User user){
        return movieMapper.contRecommend(user);
    }

}
