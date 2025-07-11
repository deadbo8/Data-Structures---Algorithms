package leetcode;

import java.util.*;

public class CombinationSum_39 {

	public static List<List<Integer>> combination(int[] arr, int target) {

		List<List<Integer>> list = new ArrayList<>();

		List<Integer> list1 = new ArrayList<>();

		helper2(arr, target, list, list1, 0);

		return list;

	}

	public static void helper2(int[] arr, int target, List<List<Integer>> list, List<Integer> list1, int pos) {
		if (target == 0) {
			list.add(new ArrayList<>(list1));
			return;
		}
		if (target < 0) {
			return;
		}
		for (int i = pos; i < arr.length; i++) {
			list1.add(arr[i]);
			helper2(arr, target - arr[i], list, list1, i);
			list1.remove(list1.size() - 1); // Backtracking
		}

	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 6, 7 };

		int target = 7;

		List<List<Integer>> list = new ArrayList<>();

		list = combination(arr, target);

		System.out.println(list);

	}
}
