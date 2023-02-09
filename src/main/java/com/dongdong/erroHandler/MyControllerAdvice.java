package com.dongdong.erroHandler;

import com.dongdong.utils.ResponseResult;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerAdvice {
  @ExceptionHandler(RuntimeException.class)
    public ResponseResult<Object> error(Exception  e){
    if (StringUtils.hasText(e.getMessage())){
      return new ResponseResult<>(500,e);
    }
      return new ResponseResult<>(500,e.getMessage());
  }
}