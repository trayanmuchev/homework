
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] a = {10, 22, 43, 64, 21}; for(int i = 4; i >= 0; i--){ if(a[i]
		 * > 21){ a[i] = (a[i] + 1)%(i+1); i++; } else{ a[i] = a[i]*2; i--; }
		 * if(i>=0){ System.out.println(a[i]); } }
		 */

		int[] oldArray = { 1, 2, 3 };
		int[] newArray = oldArray;
		oldArray[0] = -10;
		System.out.println(newArray[0]);
	}

}
