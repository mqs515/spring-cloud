package com.eureka.cloud.sribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Mqs
 * @Date 2018/11/15 21:56
 * @Desc
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String consumer(){
        return restTemplate.getForEntity("http://hello-service/hello/index", String.class).getBody();
    }
}
