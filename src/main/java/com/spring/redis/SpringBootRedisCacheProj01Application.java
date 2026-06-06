package com.spring.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRedisCacheProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisCacheProj01Application.class, args);
	}

}
