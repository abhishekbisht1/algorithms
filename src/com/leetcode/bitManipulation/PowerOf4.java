package com.leetcode.bitManipulation;

public class PowerOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 24;

		System.out.println(PowerOf4(n));

	}

	private static boolean PowerOf4(int n) {
		// TODO Auto-generated method stub

		return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0x55555555) != 0);

	}

}
