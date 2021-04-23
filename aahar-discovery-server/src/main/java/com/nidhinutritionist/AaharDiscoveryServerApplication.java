package com.nidhinutritionist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AaharDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AaharDiscoveryServerApplication.class, args);
	}

}
