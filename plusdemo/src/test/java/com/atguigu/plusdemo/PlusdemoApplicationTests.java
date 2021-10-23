package com.atguigu.plusdemo;

import com.atguigu.plusdemo.mapper.UserMapper;
import com.atguigu.plusdemo.pojo.User;
import com.atguigu.plusdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
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

}
