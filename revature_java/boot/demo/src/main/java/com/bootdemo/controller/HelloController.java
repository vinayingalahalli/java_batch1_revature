package com.bootdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to Spring Boot APP";
	}
	
	@RequestMapping("/{name}")
	public String sayHello(@PathVariable("name")String name) {
		
		return "Hello "+name;
	}
}
