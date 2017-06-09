package com.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo2ConfigClientApplication.class, args);
	}

  @Value("${foo}")
  String foo;

  @RequestMapping(value = "/hi")
  public String hi(){
	return foo;
  }

}