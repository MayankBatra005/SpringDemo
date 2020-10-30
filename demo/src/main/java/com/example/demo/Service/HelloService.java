package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String helloService(String username) {
		return "hello "+ username;
	}
}
