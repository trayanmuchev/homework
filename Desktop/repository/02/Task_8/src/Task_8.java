import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		int first = 0;
		int e;

		if (n == 1) {
			System.out.println(0);
		}

		else {

			first = n - 1;
			for (int i = 1; i <= n; i++) {
				System.out.print(first + " ");

			}
			System.out.println();
			for (e = 2; e < n * 2; e += 2) {
				for (int j = 1; j <= n; j++) {

					System.out.print(first + e + " ");

				}
				System.out.println();

			}
		}
		input.close();
	}

}
