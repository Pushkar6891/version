package com.company;

public class ClientTester1Integer {

	public static void main(String[] args) {
		String unsignedString = Integer.toUnsignedString(10, 2);
		System.out.println(unsignedString);
		String unsignedString2 = Integer.toUnsignedString(10);
		System.out.println(unsignedString2);

		int parseUnsignedInt = Integer.parseUnsignedInt("1010", 2);
		System.out.println(parseUnsignedInt);

		int divideUnsigned = Integer.divideUnsigned(100, 25);
		System.out.println(divideUnsigned);
		int remainderUnsigned = Integer.remainderUnsigned(100, 24);
		System.out.println(remainderUnsigned);

		int sum = Integer.sum(100, 20);
		System.out.println(sum);

	}
}