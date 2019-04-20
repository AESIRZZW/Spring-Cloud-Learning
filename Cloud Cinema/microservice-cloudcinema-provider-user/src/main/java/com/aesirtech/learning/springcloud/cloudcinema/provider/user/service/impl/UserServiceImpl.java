package com.aesirtech.learning.springcloud.cloudcinema.provider.user.service.impl;

import com.aesirtech.learning.springcloud.cloudcinema.provider.user.dao.UserDao;
import com.aesirtech.learning.springcloud.cloudcinema.provider.user.entities.User;
import com.aesirtech.learning.springcloud.cloudcinema.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/19 21:05
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean post(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User get(Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
