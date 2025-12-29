package com.leetcode.binaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeseralize {

	static TreeNodeS root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructTree(root);
		printTree(root);
		String data = serialize(root);
		System.out.println(data);
		TreeNodeS value = deserialize(data);
		printTree(value);

	}

	private static void printTree(TreeNodeS root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;
		System.out.print(root.val + " ");
		printTree(root.left);
		printTree(root.right);

	}

	private static String serialize(TreeNodeS root) {
		// TODO Auto-generated method stub
		if (root == null)
			return "#";
		return root.val + "," + serialize(root.left) + "," + serialize(root.right);

	}

	public static TreeNodeS deserialize(String data) {
		Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
		return helper(queue);
	}

	private static TreeNodeS helper(Queue<String> queue) {
		String s = queue.poll();
		if (s.equals("#"))
			return null;
		TreeNodeS root = new TreeNodeS(Integer.valueOf(s));
		root.left = helper(queue);
		root.right = helper(queue);
		return root;
	}

	private static void constructTree(TreeNodeS root2) {
		// TODO Auto-generated method stub
		root = new TreeNodeS(1);
		root.left = new TreeNodeS(2);
		root.right = new TreeNodeS(3);
		root.right.left = new TreeNodeS(4);
		root.right.right = new TreeNodeS(5);

	}

}

class TreeNodeS {
	int val;
	TreeNodeS left;
	TreeNodeS right;

	public TreeNodeS(int x) {
		this.val = x;

	}
}
