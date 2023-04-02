package com.string.eg018.findmostfrequentwordinstringexcludinggivenwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class MostFrequentItemAfterExcluding {

	public static List<String> mostFrequent(String str, String[] excludingItems) {

		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		String[] allWords = str.split(" +");

		Map<String, Integer> countingMap = new HashMap<>();

		for (String word : allWords) {
			word = word.toLowerCase();
			countingMap.put(word, countingMap.getOrDefault(word, 0) + 1);
		}

		for (String excluded : excludingItems) {
			if (countingMap.containsKey(excluded)) {
				countingMap.remove(excluded);
			}
		}

		TreeMap<String, Integer> mostFrequentMap = new TreeMap<>((e1, e2) -> {
			int freq1 = countingMap.get(e1);
			int freq2 = countingMap.get(e2);

			if (freq1 != freq2) {
				return freq2 - freq1;
			}

			return e1.compareTo(e2);
		});

		mostFrequentMap.putAll(countingMap);

		List<String> mostFrequentWords = new ArrayList<>();

		int topFreq = mostFrequentMap.firstEntry().getValue();

		while (!mostFrequentMap.isEmpty()) {
			Map.Entry<String, Integer> word = mostFrequentMap.pollFirstEntry();

			if (word.getValue() == topFreq) {
				mostFrequentWords.add(word.getKey());
			} else {
				break;
			}
		}

		return mostFrequentWords;
	}

	public static void main(String[] args) {
		String str = "Best items in category are Samsung lenovo. Samsung items are nice. Lenovo are cool";

		String[] excludingItems = { "in", "are" };

		System.out.println(MostFrequentItemAfterExcluding.mostFrequent(str, excludingItems));

	}
}