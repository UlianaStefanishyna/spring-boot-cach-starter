package com.springboot.starter.cache.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import redis.embedded.Redis;
import redis.embedded.RedisServer;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CacheServiceApplicationTest.RedisTestConfig.class)
public class CacheServiceApplicationTest {

    @TestConfiguration
    static class RedisTestConfig {

        @Bean(initMethod = "start", destroyMethod = "stop")
        public Redis redis() throws IOException {
            return new RedisServer(6379);
        }
    }


    @Autowired
    private CachingService cachingService;

    @Autowired
    private PhonePersonRepository phonePersonRepository;

    @Test
    public void testPutAndGet() {
        phonePersonRepository.save(Person.builder().phone("111").name("abc").build());
        Iterable<Person> all = phonePersonRepository.findAll();
        System.out.println(all.iterator().next());

        Optional<Person> abc = phonePersonRepository.findPersonByName("abc");
        System.out.println(abc.get());
    }
}