package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(DemoApplication.class, args);
		ac.getBean(BinarySearch.class).sort(new int[] {1,4},5);
	}

}
