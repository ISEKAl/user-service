package com.isekai.userservice;
//TODO 写database.sql

import com.isekai.userservice.mybatisMapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.isekai.userservice.mybatisMapper"})
@SpringBootApplication
public class UserServiceApplication {
    public static void main(String[] args) {
//        System.out.println(System.getProperty("java.class.path").replace(';','\n'));
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
