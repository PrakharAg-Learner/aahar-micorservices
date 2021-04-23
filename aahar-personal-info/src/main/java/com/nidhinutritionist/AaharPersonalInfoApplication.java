package com.nidhinutritionist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AaharPersonalInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AaharPersonalInfoApplication.class, args);
	}

}
