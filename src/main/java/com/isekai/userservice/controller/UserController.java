package com.isekai.userservice.controller;

import com.isekai.userservice.pojo.DTO.RegisterDTO;
import com.isekai.userservice.pojo.Result;
import com.isekai.userservice.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public Result register(RegisterDTO dto){
        //输出日志，调用服务
        log.info("用户注册:{}",dto);
        userService.register(dto);
        return Result.success();
    }


}
