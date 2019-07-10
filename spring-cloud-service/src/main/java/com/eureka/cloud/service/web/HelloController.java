package com.eureka.cloud.service.web;

import com.eureka.cloud.service.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * @Author Mqs
 * @Date 2018/11/14 23:43
 * @Desc
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/index")
    public String index() {
        List<String> services = client.getServices();
        services.forEach(s -> {
            List<ServiceInstance> instances = client.getInstances(s);
            instances.forEach(instance -> {
                log.info("=======================Host: {}, ServiceId: {}", instance.getHost(), instance.getServiceId());
            });
        });
        return "Hello World";
    }

    /**
     * TODO  feign中对几种不同形式参数的绑定方法
     * 以下接口
     */

    @RequestMapping("/hello1")
    public String hello(@RequestParam String name) {
        int sleepTime = new Random().nextInt(3000);
        log.info("------------------------sleepTime: " + sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "HELLO " + name;
    }

    @RequestMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName("Hello " + name);
        return user;
    }

    @RequestMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "HELLO  " + user.getName() + "  " + user.getAge();
    }
}
