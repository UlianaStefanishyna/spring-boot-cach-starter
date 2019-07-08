package com.springboot.starter.cache.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.embedded.Redis;
import redis.embedded.RedisServer;

import java.io.IOException;

@Configuration
@ConditionalOnClass(CachingService.class)
public class CacheAutoconfigurationApplication {
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Redis redis() throws IOException {
        return new RedisServer(6379);
    }

    @Bean
    public CachingService cachingService() {
        return new CachingService();
    }
}
