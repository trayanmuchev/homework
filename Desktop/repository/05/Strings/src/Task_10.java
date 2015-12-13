
import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = input.next();

		int[] codesOfStr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			codesOfStr[i] = str.charAt(i) + 5;
		}

		for (int j = 0; j < codesOfStr.length; j++) {
			System.out.printf("%c", codesOfStr[j]);
		}

		input.close();

	}

}
