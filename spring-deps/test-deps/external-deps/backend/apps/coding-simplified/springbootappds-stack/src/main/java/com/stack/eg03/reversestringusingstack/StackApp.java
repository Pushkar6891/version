package com.stack.eg03.reversestringusingstack;

import java.util.Stack;

class StackImpl {

	public String reverseString(String s) {
		Stack<Character> st = new Stack<Character>();
		String reversedString = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			st.push(c);
		}

		while (!st.isEmpty()) {
			reversedString = reversedString + st.pop();
		}

		return reversedString;
	}

}

public class StackApp {

	public static void main(String[] args) {
		StackImpl a = new StackImpl();

		String s = "Coding Simplified";
		System.out.println(a.reverseString(s));
	}

}