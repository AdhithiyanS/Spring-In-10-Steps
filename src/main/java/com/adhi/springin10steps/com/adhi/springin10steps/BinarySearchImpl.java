package com.adhi.springin10steps.com.adhi.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm SortAlgorithm;

	public BinarySearchImpl(com.adhi.springin10steps.com.adhi.springin10steps.SortAlgorithm sortAlgorithm) {
		super();
		SortAlgorithm = sortAlgorithm;
	}

	public int quicksortAlgorithm(int[] number ,int numbertoSearch)
	{
		SortAlgorithm.sortAlgorithm(number); 
		System.out.println(SortAlgorithm);
		return 3;
	}
}
