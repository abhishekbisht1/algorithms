package com.leetcode.bitManipulation;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 89;

		swapNumbers(a, b);

	}

	private static void swapNumbers(int a, int b) {
		// TODO Auto-generated method stub

		a ^= b;

		System.out.println("a :" + a);
		System.out.println("b :" + b);

		b ^= a;

		System.out.println("a :" + a);
		System.out.println("b :" + b);

		a ^= b;
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

}
