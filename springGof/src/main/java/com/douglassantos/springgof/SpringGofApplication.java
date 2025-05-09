package com.douglassantos.springgof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringGofApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGofApplication.class, args);
    }

}
