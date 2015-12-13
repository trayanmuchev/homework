import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int num = input.nextInt();
		int count = 0;
		int var = num;
		while (var != 0) {
			var /= 2;
			count++;
		}
		if (num < 0) {
			count++;
		}
		var = num;
		int[] arr = new int[count];
		int rest = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			rest = var % 2;
			if (rest == -1) {
				rest = 1;
			}
			arr[i] = rest;
			var /= 2;
		}
		if (num < 0) {
			arr[0] = 0;
		}

		System.out.println(Arrays.toString(arr));

		input.close();
	}

}
