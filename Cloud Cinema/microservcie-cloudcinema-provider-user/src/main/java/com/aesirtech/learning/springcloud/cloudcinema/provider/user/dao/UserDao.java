package com.aesirtech.learning.springcloud.cloudcinema.provider.user.dao;

import com.aesirtech.learning.springcloud.cloudcinema.provider.user.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/19 19:24
 */

@Mapper
public interface UserDao {
    public boolean addUser(User user);

    public User findById(Long id);

    public List<User> findAll();
}
