package com.neu.controller;

import com.neu.dto.ResponseDto;
import com.neu.model.Rating;
import com.neu.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RatingController")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping("/addRating")
    public ResponseDto add(@RequestBody Rating rating){
        ResponseDto responseDto = new ResponseDto();
        int c=ratingService.add(rating);
        if(c==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    @PostMapping("/updateRating")
    public ResponseDto update(@RequestBody Rating rating){
        ResponseDto responseDto = new ResponseDto();
        int c=ratingService.update(rating);
        if(c==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
