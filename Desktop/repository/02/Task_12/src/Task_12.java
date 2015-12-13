
public class Task_12 {

	public static void main(String[] args) {

		for (int i = 100; i <= 999; i++) {
			int rest1 = i % 10;
			int del1 = i / 10;
			int rest2 = del1 % 10;
			int del2 = del1 / 10;
			int rest3 = del2 % 10;

			if ((rest1 != rest2) && (rest1 != rest3) && (rest2 != rest3)) {
				System.out.println(i);
			}

		}

	}

}
