import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = null;
		System.out.println("Enter string: ");
		str = input.nextLine();
		int counter1 = 1;
		int counter2 = 0;
		int counter3 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				counter1++;
				if (counter3 > counter2) {
					counter2 = counter3;
				}
				counter3 = 0;

			}
			if (i == str.length() - 1) {
				if (counter3 > counter2) {
					counter2 = counter3;
				}
			}
			counter3++;

		}
		System.out.println("There are " + counter1 + " words" + " the longest one has " + counter2 + " letters.");
		input.close();
	}

}
