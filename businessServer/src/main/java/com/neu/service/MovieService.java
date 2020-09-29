package com.neu.service;

import com.neu.dto.PageDto;
import com.neu.mapper.MovieMapper;
import com.neu.model.Movie;
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
        pageDto.setTotal(mvList.size());
        pageDto.setList(mvList);
    }

    public List<Movie> search(Map<String, Object> mp){
        mp.put("key","%"+mp.get("key").toString()+"%");
        int size=Integer.parseInt(mp.get("size").toString());
        int page=Integer.parseInt(mp.get("page").toString());
        mp.put("start", size*page);
        mp.put("length",size);
        return movieMapper.search(mp);
    }

}
