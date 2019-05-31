package com.eureka.cloud.feign.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author Mqs
 * @Date 2018/11/20 23:12
 * @Desc
 */
@Configuration
public class DisableHystrixConfiguration {
    /**
     * TODO 为指定的客户端配置Feign.Builder
     * @return
     */
    @Bean
    @Scope("prototype")// TODO 为指定的客户端配置Feign.Builder
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }
}
