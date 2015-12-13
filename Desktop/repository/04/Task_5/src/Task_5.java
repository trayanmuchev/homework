
public class Task_5 {

	public static void main(String[] args) {

		int[][] twoDimArr = { { 10, 20, 30, 40 }, { 1, 1, 1, 2 }, { 1, 2, 3, 4 }, { 2, 0, 15, 4 } };
		int sumRow = 0;
		int maxSumRow = Integer.MIN_VALUE;
		for (int row = 0; row < twoDimArr.length; row++) {
			for (int col = 0; col < twoDimArr[0].length; col++) {
				sumRow += twoDimArr[row][col];
			}
			if (maxSumRow < sumRow) {
				maxSumRow = sumRow;
				sumRow = 0;
			}

		}
		System.out.println("Maximum sum of row is: " + maxSumRow);

		int sumCol = 0;
		int maxSumCol = Integer.MIN_VALUE;
		for (int col1 = 0; col1 < twoDimArr.length; col1++) {
			for (int row1 = 0; row1 < twoDimArr[0].length; row1++) {
				sumCol += twoDimArr[row1][col1];
			}
			if (maxSumCol < sumCol) {
				maxSumCol = sumCol;
				sumCol = 0;
			}

		}
		System.out.println("Maximum sum of column is: " + maxSumCol);

		if (maxSumRow > maxSumCol) {
			System.out.println("Maximum sum of row is > maximum sum of column.");
		}

		else {
			System.out.println("Maximum sum of row is < maximum sum of column.");
		}
	}
}
