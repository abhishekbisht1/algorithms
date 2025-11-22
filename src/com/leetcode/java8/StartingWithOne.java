package com.leetcode.java8;

import java.util.Arrays;
import java.util.List;

public class StartingWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10, 12, 15, 21, 31, 19, 1, 111);

		List<Integer> startingWithOne = numbers.stream().map(String::valueOf).filter(s -> s.startsWith("1"))
				.map(Integer::valueOf).toList();

		System.out.println(startingWithOne);

	}

}
