package com.kingli.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@RestController
@RequestMapping("/hello")
public class Eurekaprovider8003_App {
    public static void main(String[] args) {

        SpringApplication.run(Eurekaprovider8003_App.class, args);
    }
    @RequestMapping("/name")
    public String  info(String name){
        return "Hi! 8003 "+name;
    }
}
