package com.neu.controller;

import com.neu.dto.PageDto;
import com.neu.dto.ResponseDto;
import com.neu.model.Rating;
import com.neu.model.Tag;
import com.neu.service.MovieService;
import com.neu.service.RatingService;
import com.neu.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/MovieController")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private TagService tagService;

    @Autowired
    private RatingService ratingService;

    @PostMapping("/listAll")
    public ResponseDto listAll(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        movieService.listAll(pageDto);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @PostMapping("/getDetail")
    public ResponseDto getDetail(@RequestBody Map<String,Integer> mp){
        ResponseDto responseDto = new ResponseDto();
        Rating rating=ratingService.find(mp);
        List<Tag> tags=tagService.find(mp);
        Map<String,Object> details=new HashMap<>();
        if(rating!=null){
            details.put("score",rating.getScore());
            details.put("ratingTime",rating.getTimestamp());
        }
        if(tags.size()>0){
            details.put("tagList",tags);
        }
        responseDto.setContent(details);
        return responseDto;
    }
}
