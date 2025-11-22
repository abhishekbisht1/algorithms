package com.leetcode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "25525511135";
		
		RestoreIPAddress rp = new RestoreIPAddress();
		List<String> res = rp.computeIPAddress(str);
		
		for (String st : res)
			System.out.println(res);
	}

	private List<String> computeIPAddress(String str) {
		// TODO Auto-generated method stub

		List<String> result = new ArrayList<>();
		backtrack(0, 0, "", str, result);
		return result;

	}

	private void backtrack(int index, int segmentCount, String currentIP, String str, List<String> result) {
		// TODO Auto-generated method stub

		if (segmentCount == 4 && index == str.length()) {
			result.add(currentIP.substring(0, currentIP.length() - 1));
			return;

		}

		if (segmentCount == 4 || index >= str.length())
			return;

		for (int len = 1; len <= 3 && index + len <= str.length(); len++) {

			String part = str.substring(index, index + len);

			if (part.length() > 1 && part.charAt(0) == '0')
				break;

			if (Integer.parseInt(part) > 255)
				break;

			backtrack(index + len, segmentCount + 1, currentIP + part + ".", str, result);

		}

	}

}
