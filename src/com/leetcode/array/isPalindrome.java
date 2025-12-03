package com.leetcode.array;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 121;
		System.out.println(isPalindrome(x));

	}

	private static boolean isPalindrome(int x) {
		// TODO Auto-generated method stub

		if (x < 0 || x%10 == 0 && x!=0)
			return false;

		int i = 0;
		
		while (x > i) {
			i = i * 10 + x % 10;
			x = x / 10;
		}

		return (x == i || x == i / 10);

	}

}
