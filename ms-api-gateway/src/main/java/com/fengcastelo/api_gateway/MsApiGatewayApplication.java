package com.fengcastelo.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiGatewayApplication.class, args);
	}

}
