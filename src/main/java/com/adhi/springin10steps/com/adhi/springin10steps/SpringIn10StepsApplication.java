package com.adhi.springin10steps.com.adhi.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl search=context.getBean(BinarySearchImpl.class);
		
//		BinarySearchImpl search= new BinarySearchImpl( new QuickSortAlgorithm());
		int result=search.quicksortAlgorithm(new int[] {1,2},1);
		
		System.out.println(result);
	}

}
