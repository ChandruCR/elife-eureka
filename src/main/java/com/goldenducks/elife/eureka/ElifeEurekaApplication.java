package com.goldenducks.elife.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ElifeEurekaApplication {

	private static final Logger logger = LoggerFactory.getLogger(ElifeEurekaApplication.class);
	
	public static void main(String[] args) {
		logger.debug("Starting eLifeEureka Service Registry and Discovery");
		SpringApplication.run(ElifeEurekaApplication.class, args);
	}
}
