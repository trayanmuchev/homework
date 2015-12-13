import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str = input.next();
		boolean isPalindrome = true;

		if (str.length() == 1) {
			System.out.println("The word is palindrome.");
		}

		for (int i = 0, j = str.length() - 1; i < str.length() / 2 && j > str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome == false) {
			System.out.println("The word is not a palindrome.");
		} else {
			System.out.println("The word is palindrome.");
		}
		input.close();
	}

}
