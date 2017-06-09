package com.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Demo2ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo2ConfigApplication.class, args);
	}
}
