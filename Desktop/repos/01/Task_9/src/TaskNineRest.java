import java.util.Scanner;

public class TaskNineRest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.println("Enter two numbers [10 ... 99]");
			a = input.nextInt();
			b = input.nextInt();
		} while (a < 10 || a > 99 || b < 10 || b > 99);

		int rest = (a * b) % 10;

		if (rest % 2 == 0) {
			System.out.println(a * b + " " + "," + rest + " " + "even");
		}

		if (rest % 2 != 0) {
			System.out.println(a * b + " " + "," + rest + " " + "uneven");
		}

		input.close();

	}

}
