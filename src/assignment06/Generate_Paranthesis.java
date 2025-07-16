package assignment06;

import java.util.Scanner;

public class Generate_Paranthesis {

	public static void gen(int n, int open, int close, String ans) {

		if (ans.length() == 2 * n) {
			System.out.println(ans);
			return;
		}

		if (close < open) {
			gen(n, open, close + 1, ans + ")");
		}
		if (open < n) {
			gen(n, open + 1, close, ans + "(");
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		gen(n, 0, 0, "");

		s.close();
	}
}
