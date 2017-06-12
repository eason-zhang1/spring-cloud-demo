package com.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo2Eureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Eureka2Application.class, args);
	}
}
