package com.eureka.cloud.tservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mqs
 * @date 2018/11/15 22:20
 * @desc
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudTserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTserviceApplication.class, args);
    }
}
