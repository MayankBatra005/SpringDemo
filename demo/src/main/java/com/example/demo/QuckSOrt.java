package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuckSOrt implements SortAlgo{

	@Override
	public int sort(int[] num, int num1) {
		// TODO Auto-generated method stub
		System.out.println("quick sort");
		return 0;
	}

}
