
public class Task_14 {

	public static void main(String[] args) {

		double[] arr = { 17.5, 1.5, 0.6, 33.4, 47.9, 1.2, -2.5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -2.99 && arr[i] < 2.99) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
