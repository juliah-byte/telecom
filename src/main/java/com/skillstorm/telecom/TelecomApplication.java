package com.skillstorm.telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class TelecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelecomApplication.class, args);
	}

}
