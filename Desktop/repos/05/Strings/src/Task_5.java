import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String word1 = null;
		String word2 = null;
		System.out.println("Enter first word: ");
		word1 = input.nextLine();
		System.out.println("Enter second word: ");
		word2 = input.nextLine();
		char[][] mas = new char[word1.length()][word2.length()];
		int j = 0;
		int p = 0;
		boolean same = false;
		for (int i = 0; i < word1.length(); i++) {
			for (int k = 0; k < word2.length(); k++) {
				if (word1.charAt(i) == word2.charAt(k)) {
					j = i;
					p = k;
					same = true;
					break;
				}
			}
			if (same == true) {
				break;
			}
		}
		for (int k = 0; k < word2.length(); k++) {
			mas[j][k] = word2.charAt(k);
		}
		for (int k = 0; k < word1.length(); k++) {
			mas[k][p] = word1.charAt(k);
		}
		for (int i = 0; i < word1.length(); i++) {
			for (int k = 0; k < word2.length(); k++) {
				System.out.print(mas[i][k]);
			}
			System.out.println();
		}

		input.close();

	}

}
