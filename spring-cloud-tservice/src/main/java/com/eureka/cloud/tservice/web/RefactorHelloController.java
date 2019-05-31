package com.eureka.cloud.tservice.web;

import com.eureka.cloud.api.model.User;
import com.eureka.cloud.api.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Mqs
 * @Date 2018/11/20 21:50
 * @Desc TODO 依赖spring-cloud-api继承api中的HelloService
 */
@RestController
public class RefactorHelloController implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello Two" + name;
    }

    @Override
    public User hello(String name, Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name + " ,Two");
        return user;
    }

    @Override
    public String hello(User user) {
        return "Hello Two" + user.getName() + "---" + user.getAge();
    }
}
