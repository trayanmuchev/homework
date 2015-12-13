import java.util.Scanner;

public class TaskSevenDesicions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int hour;
		do {
			System.out.println("Enter hour: ");
			hour = input.nextInt();
		} while (hour < 0 || hour > 24);

		System.out.println("Enter amount of money: ");
		double money = input.nextDouble();

		System.out.println("Are you healthy? Enter 1 - Yes/0 - No: ");
		int answer = input.nextInt();
		boolean health = false;

		if (answer == 1) {
			health = true;
		}

		if (health == false) {
			System.out.println("I won't be going out.");

			if (money > 5.00) {
				System.out.println("I will buy some medicine.");
			}

			else {
				System.out.println("I will stay at home and drink some tea.");
			}
		}

		if ((health == true) && (money < 10)) {
			System.out.println("I will go to the cafe.");

		}

		if ((health == true) && (money > 10)) {
			System.out.println("I will go to the movies with my friends.");
		}

		input.close();

	}

}
