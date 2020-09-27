package com.neu.controller;

import com.neu.dto.ResponseDto;
import com.neu.model.User;
import com.neu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/logIn")
    public ResponseDto logIn(@RequestBody User user){
        ResponseDto responseDto = new ResponseDto();
        user=userService.logIn(user.getUid());
        if(user==null){
            responseDto.setSuccess(false);
        }else{
           responseDto.setContent(user);
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
