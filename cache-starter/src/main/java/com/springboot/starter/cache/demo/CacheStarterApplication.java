package com.springboot.starter.cache.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({DefaultUserConfigProperty.class})
public class CacheStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheStarterApplication.class, args);
    }

}
