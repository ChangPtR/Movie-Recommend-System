package com.neu.mapper;

import com.neu.model.Occupation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OccupationMapper {
    public List<Occupation> list();
}
