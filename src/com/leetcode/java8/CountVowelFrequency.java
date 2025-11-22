package com.leetcode.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CountVowelFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love My India";

		Map<Character, Long> vowelFreq = str.toLowerCase().chars().mapToObj(c -> (char) c)
				.filter(ch -> "aeiou".indexOf(ch) != -1)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		
		System.out.println(vowelFreq);

	}

}
