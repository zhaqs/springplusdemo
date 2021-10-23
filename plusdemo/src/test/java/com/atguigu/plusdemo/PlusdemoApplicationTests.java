package com.atguigu.plusdemo;

import com.atguigu.plusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class PlusdemoApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        Integer integer = userMapper.selectCount(null);
        System.out.println(integer);
    }

}
