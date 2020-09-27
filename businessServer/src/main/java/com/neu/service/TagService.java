package com.neu.service;

import com.neu.mapper.TagMapper;
import com.neu.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TagService {
    @Autowired
    private TagMapper tagMapper;

    public List<Tag> find(Map<String,Integer> mp){
        return tagMapper.find(mp);
    }
    public int add(Tag tag){
        return tagMapper.add(tag);
    }
    public int delete(Tag tag){
        return tagMapper.delete(tag);
    }
}
