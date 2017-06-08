package com.demo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Demo2Service {

  @Autowired
  RestTemplate restTemplate;

  public String hiService(String name) {
	return restTemplate.getForObject("http://DEMO2-EUREKA-CLIENT/hi?name="+name,String.class);
  }

}