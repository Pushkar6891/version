package com.dp.eg22.maxpiecesretrievedaftercuttingapieceofgivenlength;

public class MaxPiecesRetrievedAfterCuttingFullLengthPiece {

	public static int getMaxPieces(int[] pieces, int pieceLength) {
		if (pieces.length == 0 || pieceLength <= 0) {
			return 0;
		}

		int numberOfPieces = pieces.length;

		int[][] dp = new int[numberOfPieces][pieceLength + 1];

		for (int i = 0; i < numberOfPieces; i++) {
			for (int j = 0; j <= pieceLength; j++) {
				dp[i][j] = -1;
			}
		}

		for (int i = 0; i < numberOfPieces; i++) {
			dp[i][0] = 0;
		}

		for (int i = 0; i < numberOfPieces; i++) {
			for (int j = 1; j <= pieceLength; j++) {

				int includingCurrentPiece = -1;
				int excludingCurrentPiece = -1;

				if (pieces[i] <= j && dp[i][j - pieces[i]] != -1) {
					includingCurrentPiece = 1 + dp[i][j - pieces[i]];
				}

				if (i > 0) {
					excludingCurrentPiece = dp[i - 1][j];
				}

				dp[i][j] = Math.max(includingCurrentPiece, excludingCurrentPiece);
			}
		}

		return dp[numberOfPieces - 1][pieceLength];
	}

	public static void main(String[] args) {

		int[] pieces = { 4, 2, 3, 5 };

		int pieceLength = 7;

		System.out.println(MaxPiecesRetrievedAfterCuttingFullLengthPiece.getMaxPieces(pieces, pieceLength));

	}

}