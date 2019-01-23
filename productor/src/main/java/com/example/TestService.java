package com.example;


import com.alibaba.dubbo.config.annotation.Service;

@Service
public class TestService implements IService{
    public String sayHello(){
        System.out.println("hello,dubbo...");
        return "hello dubbo";
    }
}
