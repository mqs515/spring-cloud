package com.eureka.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Mqs
 * @date 2018/11/14 23:39
 * @desc TODO @EnableEurekaServer启动一个服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerApplication.class, args);
    }
}
