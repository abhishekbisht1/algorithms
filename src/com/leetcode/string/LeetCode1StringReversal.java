package com.leetcode.string;

public class LeetCode1StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abhishek";

		System.out.println(stringReverse(str));

	}

	private static String stringReverse(String str) {
		// TODO Auto-generated method stub
		
		int left = 0, right = str.length() -1 ; 
		char [] arr = str.toCharArray();
		
		while(left < right) {
			char temp =  arr[left]++;
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
	
		}
		return new String(arr);
	}

}
