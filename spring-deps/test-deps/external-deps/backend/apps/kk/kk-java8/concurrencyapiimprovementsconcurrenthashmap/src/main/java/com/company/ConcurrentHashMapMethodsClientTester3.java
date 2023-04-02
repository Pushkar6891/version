package com.company;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethodsClientTester3 {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, UUID> map = new ConcurrentHashMap<>();
		for (int i = 1; i < 50; i++) {
			map.put(i, UUID.randomUUID());
		}

		Integer sessionId = 20;
		String searchResult = map.search(3, (k, v) -> {
			if (k.equals(sessionId)) {
				return new String(k + ":" + v);
			}
			return null;
		});

		System.out.println(searchResult);

		System.out.println("------------------------------------------");

		String searchEntries = map.searchEntries(3, (e) -> {
			if (e.getValue().toString().contains("ab")) {
				return new String(e.getKey() + ":" + e.getValue());
			}
			return null;
		});

		System.out.println(searchEntries);

		System.out.println("------------------------------------------");
		Integer searchKeys = map.searchKeys(3, (k) -> {
			if (k > 20) {
				return k;
			}
			return null;
		});

		System.out.println(searchKeys);

		System.out.println("------------------------------------------");

		String searchValues = map.searchValues(3, v -> {
			if (v.toString().contains("ab")) {
				return v.toString();
			}
			return null;
		});

		System.out.println(searchValues);
	}
}