
public class Task_6 {

	public static void main(String[] args) {

		int[][] twoDimArr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 }

		};

		int sum = 0;
		int totalSum = 0;

		for (int row = 1; row < twoDimArr.length; row += 2) {
			for (int col = 0; col < twoDimArr[0].length; col++) {
				sum += twoDimArr[row][col];
				totalSum += twoDimArr[row][col];
			}
			System.out.println("Sum of row" + (row + 1) + " is " + sum);
			sum = 0;

		}
		System.out.println("The sum of these rows is: " + totalSum);

	}
}
