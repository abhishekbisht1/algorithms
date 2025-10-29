package com.leetcode.trie;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1WordSearchII {

	static class TrieNode {
		TrieNode[] children = new TrieNode[26];
		String word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };

		String[] words = { "oath", "pea", "eat", "rain" };

		findWords(board, words);

	}

	private static List<String> findWords(char[][] board, String[] words) {
		// TODO Auto-generated method stub

		List<String> result = new ArrayList<>();
		TrieNode root = buildTrie(words);

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				dfs(board, i, j, root,result);
			}
		}

		return null;

	}

	private static void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
		// TODO Auto-generated method stub
		char c = board[i][j];

		if (c == '#' || node.children[c - 'a'] == null)
			return;

		if (i > 0)
			dfs(board, i - 1, j, node, result);
		if (j > 0)
			dfs(board, i, j - 1, node, result);
		if (i < board.length - 1)
			dfs(board, i + 1, j, node, result);
		if (j < board[0].length - 1 )
			dfs(board, i, j + 1, node, result);

	}

	private static TrieNode buildTrie(String[] words) {
		// TODO Auto-generated method stub
		TrieNode root = new TrieNode();

		for (String w : words) {
			TrieNode node = root;

			for (char c : w.toCharArray()) {
				int i = c - 'a';

				if (node.children[i] == null)
					node.children[i] = new TrieNode();
				node = node.children[i];

			}
			node.word = w;
		}
		return root;
	}

}
