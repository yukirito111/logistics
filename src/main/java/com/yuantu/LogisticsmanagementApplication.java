package com.yuantu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuantu.dao")
public class LogisticsmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsmanagementApplication.class, args);
    }

}
