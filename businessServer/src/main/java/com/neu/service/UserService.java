package com.neu.service;

import com.neu.mapper.UserMapper;
import com.neu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Map<String,Object> logIn(int uid){
        return userMapper.logIn(uid);
    }

    public int update(User user){
        return userMapper.update(user);
    }

}
