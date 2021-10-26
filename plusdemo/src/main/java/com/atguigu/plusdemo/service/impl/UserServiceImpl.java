package com.atguigu.plusdemo.service.impl;

import com.atguigu.plusdemo.mapper.UserMapper;
import com.atguigu.plusdemo.pojo.User;
import com.atguigu.plusdemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> selectAllByName(String name) {
        return baseMapper.selectAllByName("helen");
    }
}
