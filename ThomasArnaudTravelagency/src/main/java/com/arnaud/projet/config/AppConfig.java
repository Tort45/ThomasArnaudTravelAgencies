package com.arnaud.projet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JpaConfig.class, WebConfig.class})
public class AppConfig {
	
	public AppConfig() {
		System.out.println("hello");
	}

}