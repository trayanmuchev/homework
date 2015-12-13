import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str1;
		String str2;

		do {
			System.out.println("Enter first string: ");
			str1 = input.next();
			System.out.println("Enter second string: ");
			str2 = input.next();
		} while (str1.contains(" ") || str2.contains(" "));

		int index1 = 0;
		int index2 = 0;
		char symbol1 = 0;
		char symbol2 = 0;

		if (str1.length() == str2.length()) {
			System.out.println("Same length.");
			for (int i = 0; i < str1.length(); i++) {

				if (str1.equals(str2)) {
					System.out.println("Strings are identical.");
					break;
				}
				if (str1.charAt(i) != str2.charAt(i)) {
					index1 = i + 1;
					index2 = i + 1;
					symbol1 = str1.charAt(i);
					symbol2 = str2.charAt(i);
					System.out.println(index1 + "-" + index2 + " " + symbol1 + " " + symbol2);

				}

			}

		} else {
			System.out.println("Strings are with different length.");
		}

		input.close();
	}

}
