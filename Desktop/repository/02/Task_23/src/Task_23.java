
public class Task_23 {

	public static void main(String[] args) {

		int first = 1;
		int second = 1;
		while (first < 10) {
			while (second < 10) {
				System.out.print(first + "*" + second + "=" + (first * second) + " ");
				second++;
				System.out.println();
			}
			System.out.println();

			first++;
			second = first;
		}

	}

}
