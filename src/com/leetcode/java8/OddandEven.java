//Given a list of Integer, find out all the even and odd numbers in the list using Streams
package com.leetcode.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<Boolean, List<Integer>> evenOrOdd = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		List<Integer> evens = evenOrOdd.get(true);
		List<Integer> odds = evenOrOdd.get(false);
		
		System.out.println("Even Numebrs : "+ evens);
		System.out.println("Odd Numebrs : "+ odds);

	}

}
