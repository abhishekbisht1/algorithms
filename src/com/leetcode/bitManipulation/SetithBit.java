package com.leetcode.bitManipulation;

public class SetithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 14, i = 4;
		System.out.println(setithBit(n, i));

	}

	private static int setithBit(int n, int i) {
		// TODO Auto-generated method stub
		    return n | (1 << i);
		}

}
