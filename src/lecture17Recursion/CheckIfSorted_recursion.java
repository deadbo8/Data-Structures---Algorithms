package lecture17Recursion;

public class CheckIfSorted_recursion {

	public static boolean isSorted(int[] arr, int i) {

		// base call

		if (i >= arr.length - 1) {
			return true;
		}

		if (arr[i] > arr[i + 1]) {
			return false;
		}

		// recursive call
		return isSorted(arr, i + 1);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6,9,8 };

		System.out.println(isSorted(arr, 0));
	}
}
