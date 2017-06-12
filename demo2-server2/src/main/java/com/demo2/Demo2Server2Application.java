package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Demo2Server2Application {

  public static void main(String[] args) {
	SpringApplication.run(Demo2Server2Application.class, args);
  }

  @Autowired
  private RestTemplate restTemplate;

  @Bean
  public RestTemplate getRestTemplate() {
	return new RestTemplate();
  }

  @RequestMapping("/hi")
  public String home(){
	return "hi i'm miya!";
  }

  @RequestMapping("/miya")
  public String info(){
	return restTemplate.getForObject("http://localhost:9420/info",String.class);
  }

}
