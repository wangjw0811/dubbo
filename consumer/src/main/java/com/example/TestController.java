package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
//    @Autowired
//    private ConsumerService consumerService;
    @Reference
    IService iService;
    @GetMapping(value = "/getStr")
    @ResponseBody
    public String test(){
        return iService.sayHello();
    }
}
