package com.example.sbjsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.sbjsp.dao")
public class SbJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbJspApplication.class, args);
    }

}
