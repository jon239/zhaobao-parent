package com.zhaobao.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ManagerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerServiceApplication.class, args);
    }

    @Value("${spring.application.name}")
    String springApplicationName;

    @Value("${server.port}")
    String serverPort;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        return  "Hi,I'm " + name + ". I'm from "+ springApplicationName +" on" + serverPort;
    }
}
