package com.isekai.userservice.pojo.entity;

import lombok.Data;

@Data
public class User {
    String id;
    String username;
    String password;
    int role;
}
