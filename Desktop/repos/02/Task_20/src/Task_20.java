
public class Task_20 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(j);
			}
			if (i != 0) {
				for (int e = 0; e < i; e++) {
					System.out.print(e);
				}
			}
			System.out.println();
		}

	}

}
