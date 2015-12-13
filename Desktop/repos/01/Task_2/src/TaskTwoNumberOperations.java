import java.util.Scanner;

public class TaskTwoNumberOperations {

	public static void main(String[] args) {

		System.out.println("Enter first number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		System.out.println("Enter second number: ");
		int b = input.nextInt();

		int sum = a + b;

		int dif = a - b;

		int product = a * b;

		System.out.println(a + " " + "+" + " " + " " + b + " " + " = " + " " + sum);
		System.out.println(a + " " + "-" + " " + " " + b + " " + " = " + " " + dif);
		System.out.println(a + " " + "*" + " " + " " + b + " " + " = " + " " + product);

		if (b == 0) {
			System.out.println("Can't get % zero!");
			System.out.println("Can't divide by zero!");
		}

		else {
			int rest = a % b;
			int divide = a / b;
			System.out.println(a + " " + "%" + " " + " " + b + " " + " = " + " " + rest);
			System.out.println(a + " " + "/" + " " + " " + b + " " + " = " + " " + divide);
		}

		System.out.println("Enter first floating number: ");
		double c = input.nextDouble();

		System.out.println("Enter second floating number: ");
		double d = input.nextDouble();

		double doubleSum = c + d;

		double doubleDif = c - d;

		double doubleProduct = c * d;

		System.out.println(c + " " + "+" + " " + " " + d + " " + " = " + " " + doubleSum);
		System.out.println(c + " " + "-" + " " + " " + d + " " + " = " + " " + doubleDif);
		System.out.println(c + " " + "*" + " " + " " + d + " " + " = " + " " + doubleProduct);

		if (d == 0) {
			System.out.println("Can't get % zero!");
			System.out.println("Can't divide by zero!");
		} else {
			double doubleRest = c % d;
			double doubleDivide = c / d;
			System.out.println(c + " " + "%" + " " + " " + d + " " + " = " + " " + doubleRest);
			System.out.println(c + " " + "/" + " " + " " + d + " " + " = " + " " + doubleDivide);
		}

		input.close();

	}

}
