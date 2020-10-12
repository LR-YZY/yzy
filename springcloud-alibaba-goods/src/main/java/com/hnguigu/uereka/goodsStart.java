package com.hnguigu.uereka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class goodsStart {

    public static void main(String[] args) {
        SpringApplication.run(goodsStart.class,args);
    }
}
