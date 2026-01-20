package com.metamorph.weather.config;

import java.time.Duration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager manager = new CaffeineCacheManager("weatherCache");

        manager.setCaffeine(Caffeine.newBuilder()
                .maximumSize(100) // max cache entries
                .expireAfterWrite(Duration.ofMinutes(10))); //cache expiry

        return manager;
    }
}
