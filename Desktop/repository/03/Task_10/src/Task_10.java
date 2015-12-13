import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {

		int[] arr = new int[7];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter [" + i + "]");
			arr[i] = input.nextInt();
		}

		int sum = 0;
		int avg = 0;
		for (int j = 0; j < 7; j++) {
			sum += arr[j];
		}

		avg = sum / 7;

		int excess = 0;
		int ex = Integer.MAX_VALUE;
		int index = 0;

		for (int j = 0; j < 7; j++) {
			excess = avg - arr[j];
			if (excess < 0) {
				excess *= -1;
			}
			if (excess < ex) {
				ex = excess;
				index = j;

			}

		}
		System.out.println(arr[index]);
		input.close();

	}

}
