import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Enter n: ");
		int n = input.nextInt();

		for (i = 3; i <= (3 * n) - 3; i += 3) {
			System.out.print(i + ",");
		}

		System.out.println(i);

		input.close();
	}

}
