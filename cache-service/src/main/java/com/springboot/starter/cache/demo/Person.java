package com.springboot.starter.cache.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RedisHash("people")
public class Person {

    @Id
    private String id;
    private String phone;

    @Indexed
    private String name;
}
