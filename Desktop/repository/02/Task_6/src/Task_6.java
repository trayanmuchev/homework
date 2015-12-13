import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int sum = 1;

		if (num > 0) {
			for (int i = 1; i < num; i++, sum += i) {

			}

			System.out.println(sum);
		}

		else {
			for (int i = 1; i > num; i--, sum += i) {

			}

			System.out.println(sum);

		}

		input.close();

	}

}
