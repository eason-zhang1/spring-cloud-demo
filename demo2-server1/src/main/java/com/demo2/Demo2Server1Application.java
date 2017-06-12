package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Demo2Server1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Server1Application.class, args);
	}

  @Autowired
  private RestTemplate restTemplate;

  @Bean
  public RestTemplate getRestTemplate(){
	return new RestTemplate();
  }

  @RequestMapping("/hi")
  public String callHome(){
	return restTemplate.getForObject("http://localhost:9421/miya", String.class);
  }
  @RequestMapping("/info")
  public String info(){
	return "i'm service1-hi";

  }

  @Bean
  public AlwaysSampler defaultSampler(){
	return new AlwaysSampler();
  }
}
