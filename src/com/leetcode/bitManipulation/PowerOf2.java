package com.leetcode.bitManipulation;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 16;

		System.out.println(checkifPowerOf2(n));

	}

	private static boolean checkifPowerOf2(int n) {
		// TODO Auto-generated method stub
		
		return n> 0 && (n & (n-1)) == 0;
	}

}
