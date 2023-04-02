package com.dp.eg16.coinchangeproblem.noofwaystoreachtargetsum;

public class CoinChange {

	public static int totalWaysOfCoinChange(int[] coins, int sum) {
		if (coins.length == 0 || sum <= 0) {
			return 0;
		}

		int numberOfCoins = coins.length;

		int[][] arr = new int[numberOfCoins][sum + 1];

		for (int i = 0; i < numberOfCoins; i++) {
			arr[i][0] = 1;
		}

		for (int i = 0; i < numberOfCoins; i++) {
			for (int j = 1; j <= sum; j++) {

				int includingCurrentCoin = 0;
				int excludingCurrentCoin = 0;

				if (coins[i] <= j) {
					includingCurrentCoin = arr[i][j - coins[i]];
				}

				if (i > 0) {
					excludingCurrentCoin = arr[i - 1][j];
				}

				arr[i][j] = includingCurrentCoin + excludingCurrentCoin;
			}
		}

		return arr[numberOfCoins - 1][sum];
	}

	public static void main(String[] args) {

		int[] coins = { 1, 2, 3 };

		int sum = 5;

		System.out.println(CoinChange.totalWaysOfCoinChange(coins, sum));

	}

}