package com.isekai.userservice.service.impl.impl;

import com.isekai.userservice.exception.RegisterException;
import com.isekai.userservice.mybatisMapper.UserMapper;
import com.isekai.userservice.pojo.DTO.RegisterDTO;
import com.isekai.userservice.pojo.entity.User;
import com.isekai.userservice.service.impl.UserService;
import com.isekai.userservice.utils.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public void register(RegisterDTO dto) {
        //输出日志，处理业务
        log.info("用户注册:{}",dto);
        User user=userMapper.selectUserByUsername(dto.getUsername());
        //TODO 写全局异常捕获处理逻辑
        if(user != null){
            throw new RegisterException(Constant.REGISTER_USER_EXIST);
        }

        user=new User();
        user.setRole(0);
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());

        userMapper.insertUser(user);

    }
}
