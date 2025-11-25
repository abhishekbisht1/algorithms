package com.leetcode.recursion;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String str = "MADAM";
	  System.out.println(isPalindrome(str, 0, str.length() - 1));

	}

	private static boolean isPalindrome(String str, int left, int right) {
		// TODO Auto-generated method stub
		
		if (left >= right)
			return true;
		
		if(str.charAt(left) != str.charAt(right))
		 return false;
		
		return isPalindrome(str, left + 1, right - 1) ;
		
		
	}

}
