package com.leetcode.dynamicProgramming;

public class HouseRobberIII {

	private static TreeNode root = new TreeNode();

	public static void main(String[] args) {
		root = createTree(root);
		System.out.println(rob(root));
		
}
	
	 public static int rob(TreeNode root) {
	        int[] result = dfs(root);
	        return Math.max(result[0], result[1]);
	    }

	    // returns int[2] -> [rob, notRob]
	    private static int[] dfs(TreeNode root) {

	    	if (root == null) return new int[]{0, 0};

	    	int[] left = dfs(root.left);
	        int[] right = dfs(root.right);

	        int rob = root.val + left[1] + right[1];

	        int notRob = Math.max(left[0], left[1]) + 
	                     Math.max(right[0], right[1]);

	        return new int[]{rob, notRob};
	    }

		/*
		 * private static TreeNode createTree(TreeNode root2) { // TODO Auto-generated
		 * method stub
		 * 
		 * root = new TreeNode(3); root.left = new TreeNode(2); root.right = new
		 * TreeNode(3); root.left.right = new TreeNode(3); root.right.right = new
		 * TreeNode(1); return root;
		 * 
		 * }
		 */


private static TreeNode createTree(TreeNode root2) {
	// TODO Auto-generated method stub
	
	root = new TreeNode(3);
	root.left = new TreeNode(2);
	root.right = new TreeNode(3);
	return root;
	
}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(TreeNode left, TreeNode right, int val) {
		this.left = left;
		this.right = right;
		this.val = val;
	}
}