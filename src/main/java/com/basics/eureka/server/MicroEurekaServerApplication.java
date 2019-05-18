package com.basics.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka 注册中心
 * @author hyk
 * @date 2019/05/12 14.18
 */

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class MicroEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroEurekaServerApplication.class, args);
    }

}
