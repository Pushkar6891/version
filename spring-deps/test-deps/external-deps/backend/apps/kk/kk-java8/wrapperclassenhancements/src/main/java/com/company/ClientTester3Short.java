package com.company;

public class ClientTester3Short {

	public static void main(String[] args) {
		short data = 23;
		int hashCode = Short.hashCode(data);
		System.out.println(hashCode);

		int unsignedInt = Short.toUnsignedInt(data);
		System.out.println(unsignedInt);

		long unsignedLong = Short.toUnsignedLong(data);
		System.out.println(unsignedLong);
	}
}