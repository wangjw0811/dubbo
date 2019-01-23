package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProductorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductorApplication.class, args);
    }

}

