package com.aesirtech.learning.springcloud.cloudcinema.provider.user.service;

import com.aesirtech.learning.springcloud.cloudcinema.provider.user.entities.User;

import java.util.List;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/19 21:03
 */
public interface UserService {
    public boolean post(User user);

    public User get(Long id);

    public List<User> list();
}
