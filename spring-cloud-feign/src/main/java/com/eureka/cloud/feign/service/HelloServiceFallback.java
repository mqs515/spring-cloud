package com.eureka.cloud.feign.service;

import com.eureka.cloud.feign.model.User;
import org.springframework.stereotype.Component;

/**
 * @Author Mqs
 * @Date 2018/11/20 23:20
 * @Desc
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        User user = new User();
        user.setName("未知");
        user.setAge(0);
        return user;
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
