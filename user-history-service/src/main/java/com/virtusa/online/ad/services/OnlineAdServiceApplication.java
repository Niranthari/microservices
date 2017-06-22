package com.virtusa.online.ad.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OnlineAdServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(OnlineAdServiceApplication.class, args);
    }
}
