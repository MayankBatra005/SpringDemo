package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.HelloService;

@RestController
@RequestMapping("/first")
public class HelloController {
	
	@Autowired
	HelloService hs;
	
	@RequestMapping("/h")
	public String hello() {
		return hs.helloService("Ankit");
	}
}
