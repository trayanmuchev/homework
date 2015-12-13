import java.util.Scanner;

public class Task_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int cardNum;
		do {
			System.out.println("Enter card number: ");
			cardNum = input.nextInt();
		} while (cardNum < 1 || cardNum > 51);
		int i = cardNum / 4;
		int j = cardNum % 4;
		switch (i) {

		case 0:
			switch (j) {
			case 1:
				System.out.println("2 club");
			case 2:
				System.out.println("2 diamond");
			case 3:
				System.out.println("2 heart");
			case 0:
				System.out.println("2 spades");
				j = 1;
			}
		case 1:
			switch (j) {
			case 1:
				System.out.println("3 club");
			case 2:
				System.out.println("3 diamond");
			case 3:
				System.out.println("3 heart");
			case 0:
				System.out.println("3 spades");
				j = 1;
			}
		case 2:
			switch (j) {
			case 1:
				System.out.println("4 club");
			case 2:
				System.out.println("4 diamond");
			case 3:
				System.out.println("4 heart");
			case 0:
				System.out.println("4 spades");
				j = 1;
			}
		case 3:
			switch (j) {
			case 1:
				System.out.println("5 club");
			case 2:
				System.out.println("5 diamond");
			case 3:
				System.out.println("5 heart");
			case 0:
				System.out.println("5 spades");
				j = 1;
			}
		case 4:
			switch (j) {
			case 1:
				System.out.println("6 club");
			case 2:
				System.out.println("6 diamond");
			case 3:
				System.out.println("6 heart");
			case 0:
				System.out.println("6 spades");
				j = 1;
			}
		case 5:
			switch (j) {
			case 1:
				System.out.println("7 club");
			case 2:
				System.out.println("7 diamond");
			case 3:
				System.out.println("7 heart");
			case 0:
				System.out.println("7 spades");
				j = 1;
			}
		case 6:
			switch (j) {
			case 1:
				System.out.println("8 club");
			case 2:
				System.out.println("8 diamond");
			case 3:
				System.out.println("8 heart");
			case 0:
				System.out.println("8 spades");
				j = 1;
			}
		case 7:
			switch (j) {
			case 1:
				System.out.println("9 club");
			case 2:
				System.out.println("9 diamond");
			case 3:
				System.out.println("9 heart");
			case 0:
				System.out.println("9 spades");
				j = 1;
			}
		case 8:
			switch (j) {
			case 1:
				System.out.println("10 club");
			case 2:
				System.out.println("10 diamond");
			case 3:
				System.out.println("10 heart");
			case 0:
				System.out.println("10 spades");
				j = 1;
			}
		case 9:
			switch (j) {
			case 1:
				System.out.println("Jack club");
			case 2:
				System.out.println("Jack diamond");
			case 3:
				System.out.println("Jack heart");
			case 0:
				System.out.println("Jack spades");
				j = 1;
			}
		case 10:
			switch (j) {
			case 1:
				System.out.println("Queen club");
			case 2:
				System.out.println("Queen diamond");
			case 3:
				System.out.println("Queen heart");
			case 0:
				System.out.println("Queen spades");
				j = 1;
			}
		case 11:
			switch (j) {
			case 1:
				System.out.println("Pope club");
			case 2:
				System.out.println("Pope diamond");
			case 3:
				System.out.println("Pope heart");
			case 0:
				System.out.println("Pope spades");
				j = 1;
			}
		case 12:
			switch (j) {
			case 1:
				System.out.println("Ace club");
			case 2:
				System.out.println("Ace diamond");
			case 3:
				System.out.println("Ace heart");
			case 0:
				System.out.println("Ace spades");
				j = 1;
			}

		}
		input.close();

	}

}
