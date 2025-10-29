package com.leetcode.trie;

public class Trie {
	
	private TrieNode root;

	public Trie() {
		root = new TrieNode();

	}

	public void insert(String word) {
		TrieNode node = root;

		for (char c : word.toCharArray()) {
			int index = c - 'a';

			if (node.children[index] == null) {
				node = new TrieNode();
			}
			node = node.children[index];
		}
		node.isEndOfWord = true;
	}

	public boolean search(String word) {

		TrieNode node = root;

		for (char c : word.toCharArray()) {
			int index = c - 'a';

			if (node.children[index] == null)
				return false;

			node = node.children[index];
		}
		
		return node.isEndOfWord;

	}
	
	public boolean startWith(String word) {

		TrieNode node = root;

		for (char c : word.toCharArray()) {
			int index = c - 'a';

			if (node.children[index] == null)
				return false;

			node = node.children[index];
		}
		
		return true;

	}

}

class TrieNode {

	TrieNode[] children;
	boolean isEndOfWord;

	public TrieNode() {
		children = new TrieNode[26];
		isEndOfWord = false;
	}
}
