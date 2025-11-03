package com.leetcode.recursion;

public class LeetCode2Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 5;
		System.out.println(fact(fact));

	}

	private static int fact(int fact) {
		// TODO Auto-generated method stub

		if (fact == 0 || fact == 1)
			return 1;

		return fact * fact(fact - 1);
	}

}
