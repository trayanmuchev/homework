import java.util.Scanner;

public class Task_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = input.nextInt();
		int sum = 0;

		do {
			sum += n;
			n--;

		} while (n >= 1);

		System.out.println(sum);
		input.close();
	}

}
