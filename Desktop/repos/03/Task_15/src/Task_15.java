import java.util.Scanner;

public class Task_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] arr = new double[10];
		int len = arr.length;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter element [" + i + "]");
			arr[i] = input.nextDouble();
		}
		double max = Double.MIN_VALUE;

		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int e = j + 1; e < len; e++) {
					if (max < arr[i] + arr[j] + arr[e]) {
						max = arr[i] + arr[j] + arr[e];
						firstNum = i;
						secondNum = j;
						thirdNum = e;
					}
				}

			}
		}
		System.out.println(
				"The numbers with max sum are:  " + arr[firstNum] + " " + arr[secondNum] + " " + arr[thirdNum]);
		input.close();
	}

}
