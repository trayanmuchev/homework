
import java.util.Scanner;

public class sampleFormExam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counterH = 0;
		int counterT = 0;

		while (true) {
			System.out.println("Etnter heads or tails: ");
			String word = input.next();

			if (word.equals("heads")) {
				counterT = 0;
				counterH++;
				if (counterH == 5) {
					System.out.println("5 times heads");
					break;
				}

			} else {
				if (word.equals("tails")) {
					counterH = 0;
					counterT++;
					if (counterT == 5) {
						System.out.println("5 times tails");
						break;
					}
				}
			}

		}

		input.close();

	}

}
