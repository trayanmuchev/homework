import java.util.Scanner;

public class NumberLine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Enter three-digit number: ");
			num = input.nextInt();
		} while (num < 100 || num > 999);

		int rest1 = num % 10;
		int a = num / 10;
		int rest2 = a % 10;
		int b = a / 10;
		int rest3 = b % 10;

		if (((rest1 == rest2) && (rest1 == rest3)) || ((rest3 < rest2) && (rest2 < rest1))
				|| ((rest3 > rest2) && (rest2 > rest1))) {
			if ((rest1 == rest2) && (rest1 == rest3)) {
				System.out.println("Digits are equal");

			}

			if ((rest3 < rest2) && (rest2 < rest1)) {
				System.out.println("Digits are ascending");

			}

			if ((rest3 > rest2) && (rest2 > rest1)) {
				System.out.println("Digits are descending");

			}

		}

		else {
			System.out.println("Digits are not ordered");
		}

		input.close();

	}

}