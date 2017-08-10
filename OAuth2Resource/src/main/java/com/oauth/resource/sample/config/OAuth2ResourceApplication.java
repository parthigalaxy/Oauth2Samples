package com.oauth.resource.sample.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OAuth2ResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceAppConfig.class, args);
	}
}
