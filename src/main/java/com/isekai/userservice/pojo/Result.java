package com.isekai.userservice.pojo;

import com.isekai.userservice.utils.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    int code;
    String msg;
    T data;

    public static <T> Result<T> success(T data){
        return new Result<>(1,Constant.SUCCESS,data);
    }
    public static <T> Result<T> success(){
        return new Result<>(1,Constant.SUCCESS,null);
    }
    public static <T> Result<T> failed(String s){
        return new Result<>(2,s,null);
    }
}
