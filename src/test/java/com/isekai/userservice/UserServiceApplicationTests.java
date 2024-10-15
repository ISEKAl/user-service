package com.isekai.userservice;

import com.isekai.userservice.mybatisMapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@Slf4j
@SpringBootTest(classes = UserServiceApplication.class)
class UserServiceApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        LocalDateTime now = userMapper.now();
        log.info("{}",now);
    }

}
