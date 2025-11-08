package com.leetcode;

public class LeetCode3ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PAYPALISHIRING";
		int numRows = 3;

		System.out.println(zigzagConversion(str, numRows));
	}

	private static String zigzagConversion(String str, int numRows) {
		// TODO Auto-generated method stub
        
		if (numRows == 1 || str.length() <= numRows) return str;
		StringBuilder[] rows = new StringBuilder[numRows];
		boolean isGoingDown = false;
		int curRow = 0;

		for (int i = 0; i < numRows; i++) {
			rows[i] = new StringBuilder();
		}

		for (char c : str.toCharArray()) {

			rows[curRow].append(c);

			if (curRow == 0 || curRow == numRows - 1)
				isGoingDown = !isGoingDown;

			if (isGoingDown)
				curRow += 1;
			else
				curRow -= 1;
		}

		StringBuilder result = new StringBuilder();
		for (StringBuilder sb : rows)
			result.append(sb);

		return result.toString();

	}

}
