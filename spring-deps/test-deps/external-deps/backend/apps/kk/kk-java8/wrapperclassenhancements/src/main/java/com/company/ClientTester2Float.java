package com.company;

public class ClientTester2Float {

	public static void main(String[] args) {
		boolean finite = Float.isFinite(200.89f);
		System.out.println(finite);
		boolean finite2 = Float.isFinite(20.0f / 0);
		System.out.println(finite2);

		float sum = Float.sum(20.45f, 12.5f);
		System.out.println(sum);
		float max = Float.max(20.0f, 123.34F);
		System.out.println(max);
		float min = Float.min(20.0f, 123.34F);
		System.out.println(min);
		int hashCode = Float.hashCode(200.00f);
		System.out.println(hashCode);
	}
}