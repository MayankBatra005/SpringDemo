package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	SortAlgo sa;	
	
	public int sort(int[] numbers,int number) {
		
		//sort array
	sa.sort(numbers, number);
	
	
		//search number
		//return number
		return 5;
	}

}

//auto wiring -> dependency
//components -> beans -> instances

//constructor injection
//setter injection - autowire