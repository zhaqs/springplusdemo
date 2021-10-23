package com.atguigu.plusdemo.service.impl;

import com.atguigu.plusdemo.mapper.UserMapper;
import com.atguigu.plusdemo.pojo.User;
import com.atguigu.plusdemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
