package com.neu.mapper;

import com.neu.model.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TagMapper {
    public List<Tag> find(Map<String,Integer> mp);
    public int add(Tag tag);
    public int delete(Tag tag);
}
