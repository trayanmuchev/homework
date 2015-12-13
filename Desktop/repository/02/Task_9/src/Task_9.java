import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = input.nextInt();
		System.out.println("Enter B: ");
		int b = input.nextInt();

		double sum = 0;

		for (int i = a; i < b; i++) {
			sum += (Math.pow(i, 2));

			if (i % 3 == 0) {
				System.out.print("Skip" + " " + i + "," + " ");
			}

			else {

				System.out.print(Math.pow(i, 2) + "," + " ");
				if (sum > 200) {
					break;
				}

			}

		}
		if (sum < 200) {
			System.out.print(Math.pow(b, 2));
		}
		input.close();
	}

}
