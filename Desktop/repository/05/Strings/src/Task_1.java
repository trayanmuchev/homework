import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		String firstStr;
		String secondStr;
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Enter first string: ");
			firstStr = input.nextLine();
			System.out.println("Enter second string: ");
			secondStr = input.nextLine();
		} while (firstStr.length() > 40 || secondStr.length() > 40);

		System.out.println(firstStr.toUpperCase());
		System.out.println(firstStr.toLowerCase());
		System.out.println(secondStr.toUpperCase());
		System.out.println(secondStr.toLowerCase());

		input.close();
	}

}
