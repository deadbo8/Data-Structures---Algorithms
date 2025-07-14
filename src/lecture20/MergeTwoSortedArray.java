package lecture20;

public class MergeTwoSortedArray {

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

		int[] a = { 7, 9, 15 };
		int[] b = { 11, 100, 1100, 1500 };

		int[] c = merge(a, b);

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}
}
