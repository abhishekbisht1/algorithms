package com.leetcode.recursion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vasu";
		System.out.println(reverse(str));

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		
		if(str == null || str.length() <= 1)
			return str;
		
		return  reverse(str.substring(1)) ;

	}

}
