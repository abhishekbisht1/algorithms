package com.leetcode.dynamicProgramming;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,1};
		System.out.println(houseRobber(arr));

	}

	private static int houseRobber(int[] arr) {
		// TODO Auto-generated method stub
		
	    if(arr.length ==1 ) return arr[0];
	    
	    int [] dp =  new int [arr.length];
	    dp[0] = arr[0];
	    dp[1] = arr[1];
	    
	    for(int i =2; i < arr.length ; i++) {
	    	dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
	    }
		
		return dp[arr.length - 1];
	}

}
