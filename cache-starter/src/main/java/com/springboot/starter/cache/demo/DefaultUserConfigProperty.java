package com.springboot.starter.cache.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@AllArgsConstructor
@ConfigurationProperties("cache")
public class DefaultUserConfigProperty {
}
