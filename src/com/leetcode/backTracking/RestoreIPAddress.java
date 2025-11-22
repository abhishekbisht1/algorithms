package com.leetcode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "25525511135";
		RestoreIPAddress rp = new RestoreIPAddress();
		rp.computeIPAddress(str);
	}

	private List<String> computeIPAddress(String str) {
		// TODO Auto-generated method stub
		
		List<String> result = new ArrayList<>();
		backtrack(0, 0 , "", str, result);
		
		return null;
		
	}

	private void backtrack(int index, int segmentCount, String currentIP, String str, List<String> result) {
		// TODO Auto-generated method stub
		
		if(segmentCount == 4 && index == str.length() ) {
			result.add(currentIP);
			return;
		}
		
		for(int len =1 ; len <= 3 ; len++) {
			String part = str.substring(index, len);
			
			if(part.length() > 1 && part.charAt(0) == '0') break;
		}
		
	}

}
