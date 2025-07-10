package leetcode;

import java.util.*;

public class Generate_Paranthesis_22_recursion {

	static int counter = 1;

	public static void generate(int n, String s) {

		// base condition

		int open = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				open++;
			}
		}

		int close = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				close++;
			}
		}

		if (close > open) {
			return;
		}

		if (s.length() == 2 * n) {
			System.out.println(s);
			return;
		}

		// recursive call

		if (open < n) {
			generate(n, s + "(");
		}
		if (close < n) {
			generate(n, s + ")");
		}

	}

	public static List<String> generateV1(int n) {

		List<String> build = new ArrayList<>();

		int open = 0;
		int close = 0;

		String s = "";

		helper(n, open, close, build, s);

		return build;

	}

	public static void helper(int n, int open, int close, List<String> build, String s) {

		if (close > open) {
			return;
		}
		if (s.length() == 2 * n) {
			build.add(s);
			return;
		}

		if (open < n) {
			helper(n, open + 1, close, build, s + "(");
		}
		if (close < open) {
			helper(n, open, close + 1, build, s + ")");
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		List<String> paranthesis = new ArrayList<>();

//		generate(n, "");

		paranthesis = generateV1(n);

		System.out.println(paranthesis);

		s.close();
	}
}
