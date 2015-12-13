import java.util.Scanner;

public class ChessBoard {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean black = false;
		boolean white = false;

		System.out.println("Enter first coordinates");
		System.out.println("Enter row: ");
		int row1 = input.nextInt();
		System.out.println("Enter column: ");
		int column1 = input.nextInt();

		System.out.println("Enter second coordinates");
		System.out.println("Enter row: ");
		int row2 = input.nextInt();
		System.out.println("Enter column: ");
		int column2 = input.nextInt();

		if ((row1 % 2 != 0 && column1 % 2 != 0) || (row1 % 2 == 0 && column1 % 2 == 0)) {
			black = true;
		}

		if ((row2 % 2 != 0 && column2 % 2 != 0) || (row2 % 2 == 0 && column2 % 2 == 0)) {
			black = true;
		}

		if ((row1 % 2 != 0 && column1 % 2 == 0) || (row1 % 2 == 0 && column1 % 2 != 0)) {
			white = true;
		}

		if ((row2 % 2 != 0 && column2 % 2 == 0) || (row2 % 2 == 0 && column2 % 2 != 0)) {
			white = true;
		}

		if (black && white) {
			System.out.println("Different colours");
		}

		if (!(black && white)) {
			System.out.println("Same colours");
		}

		input.close();

	}

}
