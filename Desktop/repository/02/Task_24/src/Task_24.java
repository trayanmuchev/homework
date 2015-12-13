import java.util.Scanner;

public class Task_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		int dig;

		do {
			System.out.println("Enter N [10 ... 30000]: ");
			n = input.nextInt();
		} while (n < 10 || n > 30000);

		int num = n;

		int rev = 0;
		while (n > 0) {
			dig = n % 10;
			rev = rev * 10 + dig;
			n = n / 10;
		}

		if (num == rev) {
			System.out.println(num + " is palindrome");
		}

		else {
			System.out.println(num + " is not palindrome");
		}

		input.close();
	}

}
