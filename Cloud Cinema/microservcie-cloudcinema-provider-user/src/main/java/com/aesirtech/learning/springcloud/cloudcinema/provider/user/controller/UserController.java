package com.aesirtech.learning.springcloud.cloudcinema.provider.user.controller;

import com.aesirtech.learning.springcloud.cloudcinema.provider.user.entities.User;
import com.aesirtech.learning.springcloud.cloudcinema.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/19 21:13
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/post", method = RequestMethod.POST)
    public boolean post(@RequestBody User user) {
        return userService.post(user);
    }

    @RequestMapping(value = "user/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Long id) {
        return userService.get(id);
    }

    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }
}
