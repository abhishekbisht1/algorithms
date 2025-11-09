package com.leetcode.binaryTree;

public class LeetCode3DiameterOfBinaryTree {
	
	private static TreeNode_ root;
	private static int diameter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode_ node = constructBinaryTree(root);
		System.out.println(diameterOfTree(node));;
		System.out.println(diameter);
	}

	private static int diameterOfTree(TreeNode_ node) {
		// TODO Auto-generated method stub
		if (node == null) return 0;
		
		int left = diameterOfTree(node.left);
		int right = diameterOfTree(node.right);

		
		diameter =  Math.max(left + right, diameter);
		
		
		return 1 + Math.max(left, right);
		
		
		
	}

	private static TreeNode_ constructBinaryTree(TreeNode_ node) {
		// TODO Auto-generated method stub
		
		node = new TreeNode_(1);
		node.left = new TreeNode_(2);
		node.right = new TreeNode_(3);
		node.left.left = new TreeNode_(4);
		node.left.right = new TreeNode_(5);
		
		return node;
	}

}


class TreeNode_ {
	TreeNode_ left;
	TreeNode_ right;
	int data;

	public TreeNode_() {

	}

	public TreeNode_(int data) {
		this.data = data;
	}

	public TreeNode_(TreeNode_ left, TreeNode_ right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
}