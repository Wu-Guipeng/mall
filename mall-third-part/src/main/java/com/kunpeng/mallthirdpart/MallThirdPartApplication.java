package com.kunpeng.mallthirdpart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallThirdPartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallThirdPartApplication.class, args);
    }

}
