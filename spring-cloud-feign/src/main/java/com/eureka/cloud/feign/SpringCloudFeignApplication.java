package com.eureka.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @author Mqs
 * @date 2018/11/19 22:08
 * @desc
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringCloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignApplication.class, args);
    }
}
