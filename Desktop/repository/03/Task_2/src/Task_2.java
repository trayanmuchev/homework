import java.util.Arrays;

public class Task_2 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = new int[6];

		for (int i = 0; i < arr1.length / 2; i++) {
			arr2[i] = arr1[i];
		}

		for (int j = arr1.length - 1, e = arr1.length / 2; j >= arr1.length / 2 && e < arr1.length; j--, e++) {
			arr2[e] = arr1[j];
		}

		System.out.println(Arrays.toString(arr2));

	}

}
