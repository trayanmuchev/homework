import java.util.Scanner;

public class weatherTemperature {

	public static void main(String[] args) {
		int t;

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter degrees celsius [-100 ... 100]: ");
			t = input.nextInt();
			if (t < -100 || t > 100) {
				System.out.println("You've entered invalid number!");
			}
		} while (t < -100 || t > 100);

		if (t < -20) {
			System.out.println("freezing cold");
		}

		if (t >= -20 && t < 0) {
			System.out.println("cold");
		}

		if (t >= 0 && t < 15) {
			System.out.println("chilly");
		}

		if (t >= 15 && t < 25) {
			System.out.println("warm");
		}

		if (t > 25) {
			System.out.println("hot");
		}
		input.close();
	}

}
