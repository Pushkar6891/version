package com.array.eg031.shufflecards.shufflearrayinnondeterministicway;

import java.util.Random;

public class ShuffleCards {

	public static void shuffleNumbers(int[] arr) {

		Random randomObject = new Random();

		for (int i = 0; i < arr.length; i++) {

			int randomValue = randomObject.nextInt(arr.length);

			int currentValue = arr[i];
			arr[i] = arr[randomValue];
			arr[randomValue] = currentValue;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 4, 1, 8, 9, 10 };

		for (int i = 0; i < 10; i++) {
			ShuffleCards.shuffleNumbers(arr);
		}
	}
}