import java.util.Scanner;

public class TaskThreeSwtichNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		System.out.println("Enter b: ");
		int b = input.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a + " " + "b =" + " " + b);

		input.close();

	}

}
