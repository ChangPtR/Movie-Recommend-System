package com.neu.mapper;

import com.neu.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User logIn(int uid);
    public int update(User user);
}
