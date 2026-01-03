package com.codeforces;

public class SameDifferenceString {

	public static void main(String[] argsd) {
		
		String str = "abbac";
		minimumnumberofoperations(str);

	}

	private static void minimumnumberofoperations(String str) {
		// TODO Auto-generated method stub

		int n = str.length();
		int target = str.charAt(n - 1);
		int operations = 0;

		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) != target)
				operations++;

		}

		System.out.println(operations);


	}

}
