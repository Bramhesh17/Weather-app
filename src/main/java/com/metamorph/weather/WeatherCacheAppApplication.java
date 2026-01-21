package com.metamorph.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WeatherCacheAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherCacheAppApplication.class, args);
	}
}