package com.adhi.springin10steps.com.adhi.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl search= new BinarySearchImpl( new QuickSortAlgorithm());
		int result=search.quicksortAlgorithm(new int[] {1,2},1);
		
		System.out.println(result);
	}

}
