package com.eureka.cloud.api.service;

import com.eureka.cloud.api.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Mqs
 * @Date 2018/11/20 21:43
 * @Desc
 */
@RequestMapping("/refactor")
public interface HelloService {
    /**
     * @param name
     * @return
     */
    @RequestMapping("/hello4")
    String hello(@RequestParam("name") String name);

    /**
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/hello5")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    /**
     * @param user
     * @return
     */
    @RequestMapping("/hello6")
    String hello(@RequestBody User user);
}
