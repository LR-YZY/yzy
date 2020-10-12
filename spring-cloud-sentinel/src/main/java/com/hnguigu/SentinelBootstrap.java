package com.hnguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SentinelBootstrap.class, args);
    }
}
