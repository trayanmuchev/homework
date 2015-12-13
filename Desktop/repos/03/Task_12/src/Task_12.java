import java.util.Arrays;

public class Task_12 {

	public static void main(String[] args) {

		int[] arr = { 14, 3, 2, 17, 77, 61, 1 };
		int thirdVar = 0;
		thirdVar = arr[0];
		arr[0] = arr[1];
		arr[1] = thirdVar;
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		System.out.println(Arrays.toString(arr));

	}

}
