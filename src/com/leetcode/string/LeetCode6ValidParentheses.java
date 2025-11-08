package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode6ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "]";

		System.out.println(validParentheses(str));

	}

	private static boolean validParentheses(String str) {
		// TODO Auto-generated method stub

		Map<Character, Character> mapsOfParentheses = new HashMap<>();
		mapsOfParentheses.put('(', ')');
		mapsOfParentheses.put('{', '}');
		mapsOfParentheses.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		
		
		for (char c: str.toCharArray()) {
			
			if(mapsOfParentheses.containsKey(c)) {
				stack.push(c);
				
			}else if(mapsOfParentheses.containsValue(c)) {
				
				if(!stack.isEmpty() && mapsOfParentheses.get(stack.peek()).equals(c))
					stack.pop();
				else
					return false;
				
			}
	
		
		
		
	}
		
		return stack.isEmpty();

}
	
}
