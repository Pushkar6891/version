package com.dp.eg18.cutrodinpiecestoachievemaxprofit;

public class RodCuttingProblem {

	public static int getMaxProfit(int[] pieces, int[] pr, int rodLength) {
		if (pieces.length == 0 || pr.length == 0 || rodLength <= 0) {
			return 0;
		}

		int numberOfPieces = pieces.length;

		int[][] arr = new int[numberOfPieces][rodLength + 1];

		for (int i = 0; i < numberOfPieces; i++) {
			for (int j = 1; j <= rodLength; j++) {

				int includingCurrentPieceProfit = 0;
				int excludingCurrentPieceProfit = 0;

				if (pieces[i] <= j) {
					includingCurrentPieceProfit = pr[i] + arr[i][j - pieces[i]];
				}

				if (i > 0) {
					excludingCurrentPieceProfit = arr[i - 1][j];
				}

				arr[i][j] = Math.max(includingCurrentPieceProfit, excludingCurrentPieceProfit);
			}
		}

		return arr[numberOfPieces - 1][rodLength];
	}

	public static void main(String[] args) {

		int[] pieces = { 1, 2, 3, 4, 5 };
		int[] pr = { 3, 5, 10, 11, 15 };

		int rodLength = 5;

		System.out.println(RodCuttingProblem.getMaxProfit(pieces, pr, rodLength));

	}

}