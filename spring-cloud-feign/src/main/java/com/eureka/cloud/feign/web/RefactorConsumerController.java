package com.eureka.cloud.feign.web;

import com.eureka.cloud.feign.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Mqs
 * @Date 2018/11/19 22:12
 * @Desc TODO 测试的时候启动 feign  service  tservice server 这四个服务
 */
@RestController
@RequestMapping("/feign")
public class RefactorConsumerController {
    @Autowired
    private RefactorHelloService refactorHelloService;

    /**
     * TODO  使用继承特性 208页
     * 以下接口
     */

    @RequestMapping("/consumer4")
    public String helloOne() {
        return refactorHelloService.hello("HEYAO");
    }

    @RequestMapping("/consumer5")
    public com.eureka.cloud.api.model.User helloTwo() {
        com.eureka.cloud.api.model.User heyao = refactorHelloService.hello("HEYAO", 30);
        return heyao;
    }

    @RequestMapping("/consumer6")
    public String helloThree() {
        com.eureka.cloud.api.model.User user = new com.eureka.cloud.api.model.User();
        user.setAge(30);
        user.setName("HEYAO");
        return refactorHelloService.hello(user);
    }
}
