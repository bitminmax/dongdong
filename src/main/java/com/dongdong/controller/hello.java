package com.dongdong.controller;

import com.dongdong.pojo.Category;
import com.dongdong.service.imp.SelectUserImp;
import com.dongdong.utils.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class hello {
    @Resource
    private SelectUserImp selectUserImp;
    @GetMapping("/")
    public String hello(){
        return "1";
    }
    @GetMapping("/hello")
    public String test(){
        return "我是一个测试";
    }
    @GetMapping("/err")
    public String err(){
        throw new RuntimeException("错误");
    }
    @GetMapping("/select/user")
    public ResponseResult<List<Category>> selectUser(){
        return new ResponseResult<>(200,"ok",selectUserImp.categoryList());
    }
}
