package com.dongdong.mapper;

import com.dongdong.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<Category> categoryList();
}
