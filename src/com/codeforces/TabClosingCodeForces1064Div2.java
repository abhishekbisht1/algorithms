package com.codeforces;

import java.util.Scanner;

public class TabClosingCodeForces1064Div2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long n = sc.nextLong();

			if (n * b <= a || a == b) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}

		}
		sc.close();
	}
}
