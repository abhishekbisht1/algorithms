package com.leetcode;

public class LeetCode7DuplicateInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {1,5,4,3,2,3};
		           // 0,1,2,3,4,5
		
		//int [] arr = {3, 1, 3, 4, 2};
		int [] arr = {2,5,9,6,9,3,8,9,7,1};
		
		System.out.println(findDuplicateInteger(arr));

	}

	private static int findDuplicateInteger(int[] arr) {
		// TODO Auto-generated method stub
		
		int slow = arr[0];//1
		int fast = arr[0];//1
		
		do {
		slow = arr[slow];
		fast = arr[arr[fast]];
		}while (slow!=fast);
		
		/*slow = arr[0];
		
		while(slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
			
		}*/
		
		return slow;
	}

}
