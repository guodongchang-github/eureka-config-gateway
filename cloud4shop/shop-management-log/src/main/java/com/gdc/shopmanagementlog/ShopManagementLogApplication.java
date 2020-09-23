package com.gdc.shopmanagementlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ShopManagementLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopManagementLogApplication.class, args);
    }

}
