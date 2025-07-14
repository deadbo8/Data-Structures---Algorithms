package lecture20;

public class MergeSort {

	public static int[] mergeSort(int[] arr, int l, int h) {

		if (l == h) {
			int[] x = new int[1];
			x[0] = arr[l];
			return x;
		}

		int mid = (l + h) / 2;

		int[] a = mergeSort(arr, l, mid);
		int[] b = mergeSort(arr, mid + 1, h);

		return merge(a, b);

	}

	public static int[] merge(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;

		int[] c = new int[n + m];

		int i = 0, j = 0, k = 0;

		while (i < n && j < m) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				c[k] = b[j];
				k++;
				j++;
			}
		}

		while (i < n) {
			c[k] = a[i];
			k++;
			i++;
		}
		while (j < m) {

			c[k] = b[j];
			k++;
			j++;
		}

		return c;

	}

	public static void main(String[] args) {
		int[] arr = { 6, 5, 12, 10, 9, 1 };

		int[] res = new int[arr.length];

		res = mergeSort(arr, 0, arr.length-1);

		for (int val : res) {
			System.out.print(val + " ");
		}

	}
}
