package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMergeMethodsTest {

	public static void main(String[] args) {
		Map<String, Integer> prices = new LinkedHashMap<>();
		System.out.println("Prices map: " + prices);

		prices.merge("fruits", 3, Integer::sum);
		prices.merge("fruits", 5, Integer::sum);
		System.out.println("Prices map: " + prices);

		// null removes mapping for the key:
		prices.merge("fruits", 7, (oldVal, newVal) -> {
			System.out.println("Old val:" + oldVal + "," + "new val:" + newVal);
			return null;
		});
		System.out.println("Prices map: " + prices);

		prices.put("Bread", null);
		System.out.println("Prices map: " + prices);
		// No need to handle initial null value:
		prices.merge("Bread", 42, Integer::sum);
		System.out.println("Prices map: " + prices);
	}
}