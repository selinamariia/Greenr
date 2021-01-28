package com.group41.Greenr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GreenrApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenrApplication.class, args);
	}

}
