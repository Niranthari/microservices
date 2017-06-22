package com.virtusa.online.ad.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class OnlineAdServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineAdServiceClientApplication.class, args);
    }
}

@RestController
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient serviceDiscoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<String> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.serviceDiscoveryClient.getServices();
    }
    
    @RequestMapping("/services/{applicationServices}")
    public List<String> serviceInstancesByApplicationServices(
            @PathVariable String applicationServices) {
        return this.serviceDiscoveryClient.getServices();
    }
}
