package com.aesirtech.learning.springcloud.cloudcinema.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroservcieCloudCinemaProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservcieCloudCinemaProviderUserApplication.class, args);
    }

}
