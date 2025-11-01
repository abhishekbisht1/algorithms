package com.leetcode.string;

public class LeetCode3Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "madam";
		String s2 = "hello";
		
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));

	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
