import java.util.Scanner;

public class Task_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int m;
		int n;

		do {
			System.out.println("Enter N and M [10 ... 5555]: ");
			n = input.nextInt();
			m = input.nextInt();
		} while ((n < 10) || (n > 5555) || (m < 10) || (m > 5555));

		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.println(i);
			}
		}
		input.close();

	}

}
