package com.leetcode.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> list = numbers.stream().filter(n-> !set.add(n)).distinct().toList();
		
		System.out.println(list);

	}

}
