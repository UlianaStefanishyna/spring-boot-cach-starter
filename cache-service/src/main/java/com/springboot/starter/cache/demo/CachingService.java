package com.springboot.starter.cache.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CachingService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void put(String name, String phone) {
        redisTemplate.boundHashOps("person").put(name, phone);
    }

    public String get(String name) {
        return Objects.requireNonNull(redisTemplate.boundHashOps("person").get(name)).toString();
    }
}