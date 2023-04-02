package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorTester {

	public static void main(String[] args) {

		failSafeIteratorDemo();
	}

	private static void failSafeIteratorDemo() {
		Map<String, String> phoneMap = new ConcurrentHashMap<>();
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");

		Set<String> keySet = phoneMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			phoneMap.put("Sony", "Xperia Z");
			String phoneType = iterator.next();
			System.out.println(phoneType + "\t" + phoneMap.get(phoneType));

		}
	}

}
