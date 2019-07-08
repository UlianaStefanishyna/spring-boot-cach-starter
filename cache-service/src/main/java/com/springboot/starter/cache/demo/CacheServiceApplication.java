package com.springboot.starter.cache.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class CacheServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheServiceApplication.class, args);
    }
}