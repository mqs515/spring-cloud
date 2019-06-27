package com.eureka.cloud.sribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mqs
 * @date 2018/11/15 21:54
 * @desc
 *
 * @EnableDiscoveryClient 注解让该应用注册为Eureka客户端应用，获得服务发现的能力
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudSribbonApplication {

    /**
     * @LoadBalanced 开启客户端负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSribbonApplication.class, args);
    }
}
