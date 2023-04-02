package com.company.utility;

import org.apache.commons.lang3.StringUtils;

public class StringUtility {

	public String reverseStringUsingStringBuilder(String str) {
		return StringUtils.isBlank(str) ? str : new StringBuilder(str).reverse().toString();
	}
}
