package com.leetcode.recursion;

public class LeetCode3SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(1234));
	}

	static int sumDigits(int n) {
		if (n == 0)
			return 0;
		
		return (n % 10) + sumDigits(n / 10);
	}

}