package com.stack.eg04.bracketbalance.delimetermatchingusingstack;

import java.util.Stack;

class StackImpl {

	public boolean checkCorrectBracket(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '{':
			case '[':
			case '(':
				st.push(c);
				break;
			case '}':
			case ']':
			case ')':
				if (!st.isEmpty()) {
					char ch = st.pop();
					if (ch == '{' && c != '}' || ch == '[' && c != ']' || ch == '(' && c != ')') {
						System.out.println("Not valid bracket: " + c);
						return false;
					}
				} else {
					System.out.println("Not valid brackets");
					return false;
				}
				break;
			}
		}
		if (!st.isEmpty()) {
			System.out.println("Not valid Bracket");
			return false;
		}

		return true;
	}

}

public class StackApp {

	public static void main(String[] args) {
		StackImpl a = new StackImpl();

		String st = "a[b+{c*(u-r)}]";
		System.out.println(a.checkCorrectBracket(st));

		String st1 = "a[b+{c*(u-r)}}]";
		System.out.println(a.checkCorrectBracket(st1));

		String st2 = "a+b+c*u-r)}}]";
		System.out.println(a.checkCorrectBracket(st2));

		String st3 = "a[[b+{c*(u-r)}]";
		System.out.println(a.checkCorrectBracket(st3));
	}

}