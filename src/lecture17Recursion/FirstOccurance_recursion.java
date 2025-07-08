package lecture17Recursion;

public class FirstOccurance_recursion {

	public static int findtarget(int[] arr, int i, int target) {
		// base condtion

		if (arr[i] == target) {
			return i;
		}

		if (i >= arr.length) {
			return -1;
		}

		// recursion call

		return findtarget(arr, i + 1, target);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 7, 1 };

		int target = 7;

		System.out.println(findtarget(arr, 0, target));
	}
}
