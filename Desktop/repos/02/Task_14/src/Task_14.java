import java.util.Scanner;

public class Task_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter N [10 ... 200]: ");
			n = input.nextInt();
		} while (n < 10 || n > 200);

		for (int a = n - 1; a >= 10; a--) {
			if (a % 7 == 0) {
				System.out.println(a);

			}

		}

		input.close();

	}
}
