package com.leetcode.bitManipulation;

import java.util.Arrays;

public class TwoUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2, 4, 5, 4, 6, 5, 7, 8, 7, 8};
		int [] res = unique2Numbers(arr);
		
		System.out.println(Arrays.toString(res));

	}

	private static int[] unique2Numbers(int [] arr) {
		// TODO Auto-generated method stub
		
		int result = 0;
		
		for(int num: arr){
			result ^= num;		
		}
		
		int diff = result & -result;
		
		int a =0 , b = 0;
		
		for(int n: arr) {
			
			if((n & diff) == 0) {
				a ^= n;
			}else {
				b ^= n;
			}
			
		}
		return new int [] {a, b};
	}

}
