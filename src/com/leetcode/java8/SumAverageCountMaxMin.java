package com.leetcode.java8;

import java.util.Arrays;
import java.util.List;

public class SumAverageCountMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(5, 10, 20, 7, 3, 40);
        
		//Count
		long count = numbers.stream().count();
		System.out.println("Count : " + count);
		
		//Average
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Average : " + average);
		
		//Sum
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum : " + sum);
		
		//Max
		int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("Max : " + max);
		
		//Min
		int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println("Min :" + min);

	}

}
