package com.eureka.cloud.feign.web;

import com.eureka.cloud.feign.model.User;
import com.eureka.cloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Mqs
 * @Date 2018/11/19 22:12
 * @Desc
 */
@RestController
@RequestMapping("/feign")
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/consumer")
    public String helloController(){
        return helloService.hello();
    }

    /**
     * TODO  feign中对几种不同形式参数的绑定方法
     * 以下接口
     */

    @RequestMapping("/consumer1")
    public String helloOne(){
        return helloService.hello("HEYAO");
    }

    @RequestMapping("/consumer2")
    public String helloTwo(){
        return helloService.hello("HEYAO", 30).toString();
    }

    @RequestMapping("/consumer3")
    public String helloThree(){
        User user = new User();
        user.setAge(30);
        user.setName("HEYAO");
        return helloService.hello(user);
    }
}
