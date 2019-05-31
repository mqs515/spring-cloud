package com.eureka.cloud.feign.service;

import com.eureka.cloud.api.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Mqs
 * @Date 2018/11/20 21:57
 * @Desc TODO 继承的是spring-cloud-api中的HelloService接口
 */
@FeignClient("hello-service2")// TODO 启动时会报错 hello-service  和  RefactorHelloService 中的一样，一个修改一下就可以测试了
public interface RefactorHelloService extends HelloService {
}
