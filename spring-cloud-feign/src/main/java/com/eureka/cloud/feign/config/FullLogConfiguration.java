package com.eureka.cloud.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author Mqs
 * @Date 2018/11/20 23:57
 * @Desc
 */
@Configuration
public class FullLogConfiguration {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
