import java.util.Scanner;

public class Task_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter number: ");
			num = input.nextInt();
		} while (num < 10 || num > 99);
		
		for ( ; ; ) {		
			if (num == 1) {
				break;
			} else if (num % 2 == 0) {
				num*= 0.5;
				System.out.println(num);
			} else if (num % 2 == 1) {
				num = (num * 3) + 1;
				System.out.println(num);
			}

		}
		input.close();

	}
}
