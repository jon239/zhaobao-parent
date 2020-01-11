package com.zhaobao.manager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class ManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerWebApplication.class, args);
    }

    @Value("${spring.application.name}")
    String springApplicationName;

    @Value("${server.port}")
    String serverPort;
    @Autowired
    ManagerServiceInterface managerServiceInterface;
    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return  "Hello,I'm " + name + ". I'm from "+ springApplicationName +" on" + serverPort;
    }

    @RequestMapping("/hi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return  managerServiceInterface.sayHi(name);
    }

}
