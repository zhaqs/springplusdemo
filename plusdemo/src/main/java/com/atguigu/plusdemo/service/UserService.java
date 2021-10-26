package com.atguigu.plusdemo.service;

import com.atguigu.plusdemo.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> selectAllByName(String name);
}
