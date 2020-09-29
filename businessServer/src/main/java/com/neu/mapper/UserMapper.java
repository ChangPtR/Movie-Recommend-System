package com.neu.mapper;

import com.neu.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper {
    public Map<String,Object> logIn(int uid);
    public int update(User user);
}
