import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter sum: ");
		int sum = input.nextInt();

		for (int i = 100; i <= 999; i++) {
			int rest1 = i % 10;
			int del1 = i / 10;
			int rest2 = del1 % 10;
			int del2 = del1 / 10;
			int rest3 = del2 % 10;

			if (rest1 + rest2 + rest3 == sum) {
				System.out.println(i);
			}
		}
		input.close();
	}

}