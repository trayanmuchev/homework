import java.util.Scanner;

public class TaskEightCompareNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;

		do {
			System.out.println("Enter number [1000...9999]: ");
			a = input.nextInt();
		} while (a < 1000 || a > 9999);

		int rest1 = a % 10;
		int del1 = a / 10;
		int rest2 = del1 % 10;
		int del2 = del1 / 10;
		int rest3 = del2 % 10;
		int del3 = del2 / 10;
		int rest4 = del3 % 10;

		if ((rest4 > rest3) || ((rest4 == rest3) && (rest1 > rest2))) {
			System.out.println(rest4 + "" + rest1 + " " + ">" + " " + rest3 + "" + rest2);
		}

		if (rest4 < rest3 || ((rest4 == rest3) && (rest2 > rest1))) {
			System.out.println(rest4 + "" + rest1 + " " + "<" + " " + rest3 + "" + rest2);
		}

		if ((rest4 == rest3) && (rest1 == rest2)) {
			System.out.println(rest4 + "" + rest1 + " " + "=" + " " + rest3 + "" + rest2);
		}

		input.close();

	}

}
