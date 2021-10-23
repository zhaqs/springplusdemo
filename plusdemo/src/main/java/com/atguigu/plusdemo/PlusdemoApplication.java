package com.atguigu.plusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.plusdemo.mapper")
public class PlusdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlusdemoApplication.class, args);
    }

}
