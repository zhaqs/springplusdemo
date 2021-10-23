package com.atguigu.plusdemo.mapper;

import com.atguigu.plusdemo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> selectAllByName(String name);
}