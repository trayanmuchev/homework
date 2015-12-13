import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str1;
		String str2;

		do {
			System.out.println("Enter strings: ");
			str1 = input.next();
			str2 = input.next();
		} while (str1.length() + str2.length() < 10 || str1.length() + str2.length() > 20);

		String keepStr1 = str1.substring(0, 5);
		String keepStrToEnd1 = str1.substring(5, str1.length());
		String keepStr2 = str2.substring(0, 5);
		String keepStrToEnd2 = str2.substring(5, str2.length());

		str1 = keepStr2 + keepStrToEnd1;
		str2 = keepStr1 + keepStrToEnd2;

		if (str1.length() > str2.length()) {
			System.out.println(str1.length() + str1);
		}

		if (str1.length() < str2.length()) {
			System.out.println(str2.length() + " " + str2);
		}

		if (str1.length() == str2.length()) {
			System.out.println(str1.length() + " " + str1 + " " + str2);
		}

		input.close();

	}

}
