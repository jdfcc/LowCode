package com.jdfcc.lowcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jdfcc.lowcode.mapper")
public class LowCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LowCodeApplication.class, args);
    }

}
