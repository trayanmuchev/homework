import java.util.Scanner;

public class Task_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int stars = 1 + 2 * (i);
			int space = n - i;
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}

			for (int k = 0; k < stars; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		input.close();
	}

}
