package com.string.eg015.longestsubstringlengthwithsamelettersallowedtoreplaceKchar;

import java.util.HashMap;
import java.util.Map;

public class StringApp {

	public static int longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace(String str, int k) {
		if (str == null || str.length() == 0 || k <= 0 || k > str.length()) {
			return -1;
		}

		int maxLength = 0;
		int start, end;
		start = end = 0;
		int maxFreq = 0;

		Map<Character, Integer> map = new HashMap<>();

		while (end < str.length()) {
			char currentChar = str.charAt(end);
			map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

			maxFreq = Math.max(maxFreq, map.get(currentChar));

			if (end - start + 1 - maxFreq > k) {
				char startChar = str.charAt(start);
				map.put(startChar, map.get(startChar) - 1);

				start++;
			}

			maxLength = Math.max(end - start + 1, maxLength);
			end++;
		}

		return maxLength;
	}

	public static void main(String[] args) {

		String str = "bccbababd";
		int k = 2;
		System.out.println(StringApp.longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace(str, k));
	}

}