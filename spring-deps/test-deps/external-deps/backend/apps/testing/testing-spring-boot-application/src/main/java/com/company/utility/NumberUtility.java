package com.company.utility;

public class NumberUtility {

	public boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return flag;
	}

	public int reverseNumber(int n) {

		boolean isNegative = n < 0 ? true : false;
		if (isNegative) {
			n = n * -1;
		}

		int rev = 0;
		int lastDigit = 0;

		while (n >= 1) {
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		return isNegative == true ? rev * -1 : rev;
	}

}
