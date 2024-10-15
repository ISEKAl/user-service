package com.isekai.userservice.mybatisMapper;


import com.isekai.userservice.pojo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;


public interface UserMapper {
    //TODO 完善SQL
    @Select("SELECT * FROM user where username=#{username}")
    User selectUserByUsername(String username);
    @Insert("")
    void insertUser(User user);
    LocalDateTime now();
}
