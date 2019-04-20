package com.aesirtech.learning.springcloud.cloudcinema.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservcieCloudCinemaProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservcieCloudCinemaProviderUserApplication.class, args);
    }

}
