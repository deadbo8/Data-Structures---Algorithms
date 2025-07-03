package lecture14;

import java.util.Scanner;

public class LenghtWiseSubstring_Demo {

	public static void LenghtWiseSubstring(String s1) {

		for (int len = 1; len <= s1.length(); len++) {
			for (int end = len; end <= s1.length(); end++) {
				int start = end - len;
				System.out.println(s1.substring(start, end));
			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();

		LenghtWiseSubstring(s1);

		s.close();
	}
}
