package com.leetcode.bitManipulation;

public class GetithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4 , i =2;
		
		System.out.println(getIthBit(n, i));
	}
	
	public static int getIthBit(int n, int i) {
	    return (n >> i) & 1;
	}

}
