package com.eureka.cloud.tservice.web;

import com.eureka.cloud.tservice.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String index(){
        List<String> services = client.getServices();
        services.forEach(s -> {
            List<ServiceInstance> instances = client.getInstances(s);
            instances.forEach(instance -> {
                log.info("=======================Host: {}, ServiceId: {}", instance.getHost(), instance.getServiceId());
            });
        });
        return "Hello World Two";
    }

    /**
     * TODO  feign中对几种不同形式参数的绑定方法
     * 以下接口
     */

    @RequestMapping("/hello1")
    public String hello(@RequestParam String name){
        return "HELLO TWO" + name;
    }

    @RequestMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        User user = new User();
        user.setAge(age);
        user.setName("Hello Two" + name);
        return user;
    }

    @RequestMapping("/hello3")
    public String hello(@RequestBody User user){
        return "HELLO Two " + user.getName() + "  " + user.getAge();
    }

}
