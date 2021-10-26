package com.atguigu.plusdemo.controller;

import com.atguigu.plusdemo.pojo.User;
import com.atguigu.plusdemo.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public List<User> list(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("name","age","email","create_time","update_time");
        return userService.list(userQueryWrapper);
    }

    @RequestMapping("/count")
    public int count(){
        return userService.count();
    }
}