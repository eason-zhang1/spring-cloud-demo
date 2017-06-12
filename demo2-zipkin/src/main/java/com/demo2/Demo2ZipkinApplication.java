package com.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class Demo2ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo2ZipkinApplication.class, args);
	}
}
