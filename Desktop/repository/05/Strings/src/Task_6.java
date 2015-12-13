import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = null;
		System.out.println("Enter sentence: ");
		str = input.nextLine();
		int[] codes = new int[str.length()];
		char ch = 0;

		codes[0] = str.charAt(0) - 32;
		boolean counting = false;

		for (int i = 1; i < str.length(); i++) {
			if (counting == true) {
				counting = false;
				continue;
			}

			if (str.charAt(i) == ' ') {
				ch = str.charAt(i + 1);
				codes[i + 1] = ch - 32;
				counting = true;

			}

			if (str.charAt(i) != ch || counting == false) {
				codes[i] = str.charAt(i);
			}

		}

		for (int j = 0; j < codes.length; j++) {
			System.out.printf("%c", codes[j]);
		}

		input.close();

	}

}
