package com.neu.controller;

import com.neu.dto.ResponseDto;
import com.neu.model.Tag;
import com.neu.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TagController")
public class TagController {
    @Autowired
    private TagService tagService;

    @PostMapping("/addTag")
    public ResponseDto add(@RequestBody Tag tag){
        ResponseDto responseDto = new ResponseDto();
        int c=tagService.add(tag);
        if(c==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    @PostMapping("/deleteTag")
    public ResponseDto deleteTag(@RequestBody Tag tag){
        ResponseDto responseDto = new ResponseDto();
        int c=tagService.delete(tag);
        if(c==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

}
