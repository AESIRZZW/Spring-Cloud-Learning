package com.aesirtech.learning.springcloud.cloudcinema.consumer.user.controller;

import com.aesirtech.learning.springcloud.cloudcinema.provider.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/20 18:58
 */

@RestController
public class UserController {

    private static final String REST_URL_PREFIX = "http://localhost:8001/provider/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "user/post", method = RequestMethod.POST)
    public boolean post(@RequestBody User user) {
        return restTemplate.postForObject(REST_URL_PREFIX + "user/post", user, Boolean.class);
    }

    @RequestMapping(value = "user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "user/get/"+id, User.class);
    }

    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public List<User> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "user/list", List.class);
    }

    @RequestMapping(value = "user/discovery", method = RequestMethod.GET)
    public Object discovery() {
        return this.discoveryClient;
    }
}
