package com.atguigu.plusdemo;

import com.atguigu.plusdemo.mapper.UserMapper;
import com.atguigu.plusdemo.pojo.User;
import com.atguigu.plusdemo.service.UserService;
import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sun.deploy.util.ArrayUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class PlusdemoApplicationTests {

    @Resource
    UserMapper userMapper;

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        Integer integer = userMapper.selectCount(null);
        System.out.println(integer);
    }

    @Test
    void TestUserService(){
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setAge(18+i);
            user.setName("zhangsan");
            user.setEmail(user.getName()+"qq.com");
            users.add(user);
        }
        userService.saveBatch(users);
    }

    @Test
    void testSelectAllByName(){
        List<User> users = userMapper.selectAllByName("zhang");
        users.forEach(System.out::println);
    }

    @Test
    void testAutoFill(){
        userService.save(new User());
    }

    @Test
    void TestDelete(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        userMapper.deleteBatchIds(arr);
    }

    @Test
    void TestPage(){
        Page<User> userPage = new Page<>(2,3);
        Page<User> page = userMapper.selectPage(userPage, null);
        List<User> records = page.getRecords();
        records.forEach(System.out :: println);
    }
}
