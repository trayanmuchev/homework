import java.util.Scanner;

public class TaksOneNumbers {

	public static void main(String[] args) {

		System.out.println("Enter first number: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();

		System.out.println("Enter second number: ");
		double b = input.nextDouble();

		System.out.println("Enter third number: ");
		double c = input.nextDouble();

		input.close();

		if (((a < c) && (c < b)) || ((b < c) && (c < a))) {
			System.out.println(c + " " + "is between" + " " + a + " " + "and" + " " + b);
		}

		else {

			System.out.println(c + " " + "isn't between" + " " + a + " " + "and" + " " + b);

		}

	}

}
