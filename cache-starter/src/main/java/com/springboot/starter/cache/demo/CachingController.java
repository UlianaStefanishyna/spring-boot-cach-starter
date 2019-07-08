package com.springboot.starter.cache.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingController {

    private final DefaultUserConfigProperty defaultUserConfigProperty;
    private final CachingService cachingService;

    public CachingController(DefaultUserConfigProperty defaultUserConfigProperty, CachingService cachingService) {
        this.defaultUserConfigProperty = defaultUserConfigProperty;
        this.cachingService = cachingService;
    }

    @PutMapping(path = "/cache/{name}/{phone}")
    public ResponseEntity<Void> put(@PathVariable String name, @PathVariable String phone) {
        System.out.println(name);
        System.out.println(phone);

        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/cache/{name}")
    public ResponseEntity<String> put(@PathVariable String name) {
        System.out.println(name);
        String phone = "phone";
        return ResponseEntity.ok(phone);
    }
}
