package com.fd.cloudeurakeclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudEurakeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurakeClientApplication.class, args);
	}
}
