import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int length;
		char symbol;

		do {
			System.out.println("Enter length: ");
			length = input.nextInt();
			System.out.println("Enter symbol: ");
			input.nextLine();
			symbol = input.next().charAt(0);
		} while (length < 3);

		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				if (i == 1) {
					System.out.print("*");
				} else if (j == 1 && i != 1 && i != length) {
					System.out.print("*");
				} else if (j == length && i != 1 && i != length) {
					System.out.print("*");
				} else if (j != 1 && j != length && i != 1 && i != length) {
					System.out.print(symbol);
				} else if (i == length) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
		input.close();

	}

}
