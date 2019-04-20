package com.aesirtech.learning.springcloud.cloudcinema.consumer.user;

/**
 * @ProjectName: Cloud Cinema
 * @Description:
 * @Author: Aesir
 * @Date: 2019/4/20 19:32
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroserviceCloudCinemaConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloudCinemaConsumerUserApplication.class, args);
    }

}