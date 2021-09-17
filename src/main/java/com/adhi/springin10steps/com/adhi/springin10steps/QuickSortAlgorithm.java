package com.adhi.springin10steps.com.adhi.springin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sortAlgorithm(int[] numbers)
	{
		return numbers;
	}
	
}
