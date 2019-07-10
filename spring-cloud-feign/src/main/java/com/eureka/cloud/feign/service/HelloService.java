package com.eureka.cloud.feign.service;

import com.eureka.cloud.feign.config.FullLogConfiguration;
import com.eureka.cloud.feign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Mqs
 * @Date 2018/11/19 22:09
 * TODO 注解的configuration属性用来指定Hystrix的配置
 * , configuration = DisableHystrixConfiguration.class
 * @Desc TODO 注解的fallback属性用来指定对应大的服务降级实现类
 */

@FeignClient(name = "hello-service", fallback = HelloServiceFallback.class, configuration = FullLogConfiguration.class)
// TODO 启动时会报错 hello-service  和  RefactorHelloService 中的一样，一个修改一下就可以测试了
public interface HelloService {
    /**
     * @return
     * @FeignClient通过注解指定服务名绑定服务
     */
    @RequestMapping("/hello/index")
    String hello();

    /**
     * TODO  feign中对几种不同形式参数的绑定方法
     * 以下接口
     */

    @RequestMapping("/hello/hello1")
    String hello(@RequestParam("name") String name);

    @RequestMapping("/hello/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("/hello/hello3")
    String hello(@RequestBody User user);
}
