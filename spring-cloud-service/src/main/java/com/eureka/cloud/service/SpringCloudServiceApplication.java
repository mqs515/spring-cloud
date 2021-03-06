package com.eureka.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mqs
 * @date 2018/11/14 23:49
 * @desc TODO @EnableDiscoveryClient
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceApplication.class, args);
    }
}
