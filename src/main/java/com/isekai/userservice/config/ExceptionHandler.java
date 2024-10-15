package com.isekai.userservice.config;

import com.isekai.userservice.exception.BaseException;
import com.isekai.userservice.exception.RegisterException;
import com.isekai.userservice.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    ResponseEntity<Result> handler(BaseException e){
        if(e instanceof RegisterException){
            return new ResponseEntity<>(Result.failed(e.getMessage()), HttpStatus.valueOf(200));
        }
        else{
            return new ResponseEntity<>(Result.failed("未知错误:"+e.getMessage()), HttpStatus.valueOf(200));
        }
    }
}
