import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = input.next();
		System.out.println("Enter second name: ");
		String secondName = input.next();

		if ((firstName.compareTo(secondName)) > 0) {

			System.out.println(firstName);
		}

		if ((firstName.compareTo(secondName)) == 0) {

			System.out.println(firstName);
			System.out.println(secondName);
		}

		if ((firstName.compareTo(secondName)) < 0) {

			System.out.println(secondName);
		}

		input.close();

	}

}
