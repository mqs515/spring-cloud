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

    /**
     * 可以做到类似ribbon负载均衡
     *
     * @return
     */
    @RequestMapping("/consumer")
    public String helloController() {
        return helloService.hello();
    }

    /**
     * TODO  feign中对几种不同形式参数的绑定方法
     * 以下接口
     */

    @RequestMapping("/consumer1")
    public String helloOne() {
        return helloService.hello("HEYAO +  consumer1");
    }

    @RequestMapping("/consumer2")
    public String helloTwo() {
        return helloService.hello("HEYAO +  consumer2", 30).toString();
    }

    @RequestMapping("/consumer3")
    public String helloThree() {
        User user = new User();
        user.setAge(30);
        user.setName("HEYAO +  consumer3");
        return helloService.hello(user);
    }
}
