package com.boot002;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot002Application {

	
	private static final Logger logger = LoggerFactory.getLogger(Boot002Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Boot002Application.class, args);
	}

}
