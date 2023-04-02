package com.java8.eg0001;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface {

	@Override
	public int getMax(List<Integer> nums) {
		int max = Collections.max(nums);
		return max;
	}

}
