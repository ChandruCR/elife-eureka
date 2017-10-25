package com.goldenducks.elifeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ElifeEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElifeEurekaApplication.class, args);
	}
}
