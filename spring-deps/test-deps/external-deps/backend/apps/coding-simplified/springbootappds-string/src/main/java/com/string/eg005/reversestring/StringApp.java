package com.string.eg005.reversestring;

import java.util.Stack;

class StringLib {

	public String reverseStringAnother(String str) {
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}

		return s;
	}

	public void printReverseString(String s) {

		int start = 0;
		int end = s.length() - 1;

		char[] ch = s.toCharArray();

		while (start < end) {
			char c = ch[start];
			ch[start] = ch[end];
			ch[end] = c;

			start++;
			end--;
		}

		for (int i = 0; i < s.length(); i++) {
			System.out.print(ch[i] + "");
		}
	}

	public String reverseString(String s) {

		int start = 0;
		int end = s.length() - 1;

		char[] ch = s.toCharArray();

		while (start < end) {
			char c = ch[start];
			ch[start] = ch[end];
			ch[end] = c;

			start++;
			end--;
		}

		return String.copyValueOf(ch);
	}

	public void reverseStack(String str) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));
		}

		while (!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

}

public class StringApp {

	public static void main(String[] args) {
		StringLib obj = new StringLib();

		String str = "coding";
		StringBuilder sb = new StringBuilder(str);

		sb = sb.reverse();
		System.out.println(sb);

		obj.printReverseString(str);
		System.out.println();

		System.out.println(obj.reverseString(str));

		obj.reverseStack(str);
	}
}