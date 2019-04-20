package com.aesirtech.learning.springcloud.cloudcinema.consumer.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: Cloud Cinema
 * @Description: Beans Configuration
 * @Author: Aesir
 * @Date: 2019/4/20 18:53
 */
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
