package com.aesirtech.learning.springcloud.cloudcinema.provider.user.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/19 18:26
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private long id;
    private String userName;
    private String name;
    private byte age;
    private boolean sex;
    private double balance;
}
