import java.util.Arrays;

public class Task_7 {

	public static void main(String[] args) {

		int[] arr1 = { 7, 4, 13, 12, 82, 8, 0, 2 };
		int[] arr2 = new int[arr1.length];

		arr2[0] = arr1[0];
		arr2[arr2.length - 1] = arr1[arr1.length - 1];

		for (int i = 1; i < arr2.length - 1; i++) {

			arr2[i] = arr1[i + 1] + arr1[i - 1];

		}
		System.out.println(Arrays.toString(arr2));

	}

}
