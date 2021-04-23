package com.nidhinutritionist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AaharBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(AaharBlogApplication.class, args);
	}

}
