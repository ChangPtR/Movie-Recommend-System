package com.neu.controller;

import com.neu.dto.ResponseDto;
import com.neu.model.User;
import com.neu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/UserController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/logIn")
    public ResponseDto logIn(@RequestBody User user){
        ResponseDto responseDto = new ResponseDto();
        Map<String,Object> ump=userService.logIn(user.getUid());
        if(ump==null){
            responseDto.setSuccess(false);
        }else{
           responseDto.setContent(ump);
        }
        return responseDto;
    }

    @RequestMapping("/update")
    public ResponseDto updateSelective(@RequestBody User user){
        ResponseDto responseDto = new ResponseDto();
        int c = userService.update(user);
        if(c==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
