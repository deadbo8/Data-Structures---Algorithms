package codeSkiller;

import java.util.Scanner;

public class FindingCBNumber {

	public static boolean isCBNumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		if (n == 0 || n == 1) {
			return false;
		}

		for (int val : arr) {
			if (val == n) {
				return true;
			}
		}

		for (int val : arr) {
			if (n % val == 0) {
				return false;
			}
		}

		return true;
	}

	public static boolean isAlreadyUsed(boolean[] visited, int start, int end) {
		for (int i = start; i < end; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static void LenghtWiseSubstring(String s1) {
		int count = 0;
		boolean[] visited = new boolean[s1.length()];

		for (int len = 1; len <= s1.length(); len++) {
			for (int end = len; end <= s1.length(); end++) {
				int start = end - len;
//				System.out.println(s1.substring(start, end));
				String part = s1.substring(start, end);
				if (isCBNumber(Long.parseLong(part)) && isAlreadyUsed(visited, start, end)) {
					count++;
					for (int i = start; i < end; i++) {
						visited[i] = true;
					}
				}

			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n =s.nextInt();
		s.nextLine();

		String s1 = s.nextLine();

		LenghtWiseSubstring(s1);

		s.close();

	}

}
