package com.leetcode.bitManipulation;

public class SIngleNumberWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,4,1,2,3,5,5,3,2,1};
		System.out.println(computeUnqiueNumber(arr));

	}

	private static int computeUnqiueNumber(int[] arr) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int num: arr) {
			result ^=num;
		}
		if (result == 0)
				return -1;
		else return result;
	}

}
