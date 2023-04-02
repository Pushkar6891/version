package com.company.junit5.util;

public class MyUtils {

	/**
	 * Method perform addition of two numbers
	 * 
	 * @param n1 first input number
	 * @param n2 second input number
	 * @return addition of two numbers
	 */
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	/**
	 * Method to check whether input String is Palindrome or not
	 * 
	 * @param inputText
	 * @return return true if input is Palindrome else false
	 */
	public static boolean isPalindrome(String inputText) {
		return new StringBuffer(inputText).reverse().toString().equals(inputText);
	}

	/**
	 * Method perform multiplication of two numbers
	 * 
	 * @param n1 first input number
	 * @param n2 second input number
	 * @return multiplication of two numbers
	 */
	public static Integer multiply(int n1, int n2) {
		return n1 * n2;
	}

	/**
	 * Finding Square of input number
	 * 
	 * @param number
	 * @return
	 */
	public static int squareOfNumber(int number) {
		return number * number;
	}
}