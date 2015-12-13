import java.util.Scanner;

public class Task_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int len = input.nextInt();
		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.println("Enter [" + i + "]");
			arr[i] = input.nextInt();
		}

		boolean first = false;
		boolean last = false;
		boolean even = false;
		boolean odd = false;

		if (arr[0] < arr[1]) {
			first = true;
		}

		if ((len % 2 != 0 && arr[len - 1] < arr[len - 2]) || (len % 2 == 0 && arr[len - 1] > arr[len - 2])) {
			last = true;
		} else {
			last = false;
		}

		for (int j = 1; j < len - 1; j += 2) {
			if ((arr[j] > arr[j - 1]) && (arr[j] > arr[j + 1])) {
				odd = true;
			}

		}

		for (int e = 2; e < len - 1; e += 2) {
			if ((arr[e] < arr[e - 1]) && (arr[e] < arr[e + 1])) {
				even = true;
			}
		}

		if (first && last && odd && even) {
			System.out.println("Array is ascending edgy.");

		} else {
			System.out.println("Array is not ascending edgy.");
		}

		input.close();

	}

}