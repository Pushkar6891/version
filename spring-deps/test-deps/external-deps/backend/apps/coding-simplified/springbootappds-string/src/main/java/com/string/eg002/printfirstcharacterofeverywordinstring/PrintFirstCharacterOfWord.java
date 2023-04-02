package com.string.eg002.printfirstcharacterofeverywordinstring;

public class PrintFirstCharacterOfWord {

	public static void main(String[] args) {

		String[] arr = { "", "Pushkar Chauhan", "Hello User!! Welcome" };
		for (int i = 0; i < arr.length; i++) {
			print(arr[i]);
			System.out.println();
		}

	}

	private static void print(String s) {
		if (s == null || s.length() <= 0 || "".equals(s)) {
			return;
		}
		char a[] = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
				System.out.print(a[i] + " ");
			}
		}
	}
}