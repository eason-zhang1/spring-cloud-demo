package com.demo2.controller;

import com.demo2.service.Demo2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

  @Autowired
  Demo2Service demo2Service;

  @RequestMapping(value = "/hi")
  public String hi(@RequestParam String name){
	return demo2Service.hiService(name);
  }
}
