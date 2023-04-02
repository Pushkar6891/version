package com.string.eg007.reverseorderingofindiviualwordsinstring;

class StringLib {

	public String reverseWords(String str) {

		String finalStr = "";
		String tempStr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr = " " + tempStr + finalStr;
				tempStr = "";
			} else {
				tempStr = tempStr + c;
			}
		}

		finalStr = tempStr + finalStr;

		return finalStr;
	}

	public String reverseWordsStringBuilder(String str) {

		StringBuilder finalStr = new StringBuilder();
		StringBuilder tempStr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr.insert(0, tempStr).insert(0, " ");
				tempStr.setLength(0);
			} else {
				tempStr.append(c);
			}
		}

		finalStr.insert(0, tempStr);

		return finalStr.toString();
	}

	public String reverseWordsUsingReverse(String str) {
		str = reverseString(str);
		str = reverseIndividualWord(str);

		return str;
	}

	public String reverseIndividualWord(String str) {

		String finalStr = "";
		String tempStr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr = finalStr + tempStr + " ";
				tempStr = "";
			} else {
				tempStr = c + tempStr;
			}
		}

		finalStr = finalStr + tempStr;

		return finalStr;
	}

	public String reverseString(String str) {
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}

		return s;
	}
}

public class StringApp {

	public static void main(String[] args) {
		StringLib obj = new StringLib();

		String str = "coding simplified nice";

		System.out.println(obj.reverseWords(str));
		System.out.println(obj.reverseWordsStringBuilder(str));

		System.out.println(obj.reverseWordsUsingReverse(str));

	}
}