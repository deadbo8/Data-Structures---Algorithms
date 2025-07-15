package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Valid_Anagram_242 {

	public static boolean valid(String s, String t) {
		
		// frequency array method O(n)
		if (s.length() != t.length()) {
			return false;
		}

		int[] arr = new int[26];
		int[] arr1 = new int[26];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a'] += 1;
		}
		for (int i = 0; i < t.length(); i++) {
			arr1[t.charAt(i) - 'a'] += 1;
		}

		return Arrays.equals(arr, arr1);

//		char[] arr1 = s.toCharArray();
//		char[] arr2 = t.toCharArray();
//		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		return Arrays.equals(arr1, arr2);   // take nlogn time complexity - by sorting  //second method by hashmap // third by frequency array (ch-a)

// ---------------------------------------------------------------------------------------------------------------------------------------------------
//		sum of ascii values misses some test cases

//		int sum1 = 0;
//		int sum2 = 0;
//
//		for (int i = 0; i < s1.length(); i++) {
//			sum1 += s1.charAt(i);
//			sum2 += s2.charAt(i);
//		}
//
//		if (sum1 == sum2) {
//			return true;
//		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		boolean isValid = valid(s, t);

		System.out.println(isValid);

		sc.close();
	}
}
