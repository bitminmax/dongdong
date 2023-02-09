package com.dongdong.service.imp;

import com.dongdong.mapper.UserMapper;
import com.dongdong.pojo.Category;
import com.dongdong.service.SelectUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SelectUserImp implements SelectUser {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<Category> categoryList() {
        return userMapper.categoryList();
    }
}
