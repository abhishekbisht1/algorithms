package com.leetcode.string;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {

		if (s == null)
			return true;
		int i = 0, j = s.length() - 1;

		while (i < j) {

			while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
				j--;

			if (i < j) {

				char c1 = Character.toLowerCase(s.charAt(i));
				char c2 = Character.toLowerCase(s.charAt(j));
				if (c1 != c2)
					return false;

			}
			i++;
			j--;

		}
		return true;

	}

}
