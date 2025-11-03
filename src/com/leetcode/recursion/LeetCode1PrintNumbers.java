package com.leetcode.recursion;

public class LeetCode1PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;

		printNumbers(i);

	}

	private static void printNumbers(int n) {
		// TODO Auto-generated method stub

		if (n == 0)
			return;

		printNumbers(n - 1);
		System.out.println(n);

	}

}
