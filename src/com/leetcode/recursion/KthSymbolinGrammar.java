package com.leetcode.recursion;

public class KthSymbolinGrammar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2, k = 2;
		System.out.println(kthSymbolInGrammar(n, k));
	}

	private static int kthSymbolInGrammar(int n, int k) {
		// TODO Auto-generated method stub

		if (n == 1)
			return 0;

		int parent = kthSymbolInGrammar(n - 1, (k + 1) / 2);

		if (k % 2 == 1)
			return parent;

		return parent ^ 1;

	}

}
