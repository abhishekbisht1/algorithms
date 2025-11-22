package com.leetcode.graph.dfs;


public class PathSum {

	static TreeNode root = new TreeNode();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root_ = constructBinaryTree(root);
		System.out.println(hasPathSum(root_, 22 ));

	}

	private static TreeNode constructBinaryTree(TreeNode root) {
		// TODO Auto-generated method stub

		root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		return root;

	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null)
			return targetSum - root.val == 0;

		targetSum -= root.val;

		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
