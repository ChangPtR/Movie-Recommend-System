package com.neu.controller;

import com.neu.dto.ResponseDto;
import com.neu.model.Occupation;
import com.neu.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OccupationController")
public class OccupationController {

    @Autowired
    private OccupationService occupationService;
    @PostMapping("/list")
    public ResponseDto list(){
        ResponseDto responseDto = new ResponseDto();
        List<Occupation> occList=occupationService.list();
        responseDto.setContent(occList);
        return responseDto;
    }
}
