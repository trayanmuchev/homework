import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int len = input.nextInt();
		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.println("Enter element [" + i + "]");
			arr[i] = input.nextInt();
		}
		int index1 = 0;
		int index2 = len - 1;
		for (int i = 0; i < len / 2; i++) {
			arr[index1] = arr[index1] + arr[index2];
			arr[index2] = arr[index1] - arr[index2];
			arr[index1] = arr[index1] - arr[index2];
			index1++;
			index2--;
		}

		for (int i = len - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		input.close();

	}

}
