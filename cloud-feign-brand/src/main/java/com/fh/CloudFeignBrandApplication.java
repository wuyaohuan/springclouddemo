package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudFeignBrandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignBrandApplication.class, args);
    }

}
