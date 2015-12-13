import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of first array: ");
		int len1 = input.nextInt();
		System.out.println("Enter length of second array: ");
		int len2 = input.nextInt();

		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];

		for (int i = 0; i < len1; i++) {
			System.out.println("Enter [" + i + "]");
			arr1[i] = input.nextInt();

		}

		for (int j = 0; j < len2; j++) {
			System.out.println("Enter [" + j + "]");
			arr2[j] = input.nextInt();
		}

		boolean same = false;

		if (len1 == len2) {
			System.out.println("The length of first array is equal to the length of second array.");
			for (int e = 0; e < len1; e++) {
				if (arr1[e] == arr2[e]) {
					same = true;
				} else {
					System.out.println("Arrays are not the same");
					break;

				}
			}
			if (same) {
				System.out.println("Arrays are the same.");

			}

		} else {
			System.out.println(
					"The length of first array is not equal to the length of second array. Arrays are not the same.");
		}
		input.close();
	}
}
