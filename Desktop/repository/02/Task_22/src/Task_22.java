import java.util.Scanner;

public class Task_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int countNum = 0;

		do {
			System.out.println("Enter number [1 ... 99]: ");
			num = input.nextInt();
		} while (num < 1 || num > 999);

		for (int i = num;; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				countNum++;
				System.out.print(countNum + ":" + i + "  ");

			}
			if (countNum == 10) {
				break;
			}
		}
		input.close();

	}

}