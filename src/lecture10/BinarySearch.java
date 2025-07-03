package lecture10;

public class BinarySearch {

	public static int BinaryS(int[] arr, int n) {
		int l = 0, h = arr.length - 1;

		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == n) {
				return mid;
			} else if (arr[mid] > n) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6, 7, 8, 10, 12, 13, 14, 16, 17, 18 };
		System.out.println(BinaryS(arr, 13));

	}

}
