package com.fd.cloudeurakeclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
public class CloudEurakeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurakeClientApplication.class, args);
	}
}
