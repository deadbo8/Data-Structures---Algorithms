package lecture20;

public class Quicksort_Demo {

	public static int pivot(int[] arr, int start, int end) {

		int element = arr[end];

		int pos = 0;

		for (int i = 0; i < end; i++) {
			if (arr[i] <= element) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				pos++;
			}
		}
		int temp = arr[end];
		arr[end] = arr[pos];
		arr[pos] = temp;

		return pos;

	}
	
	public static void quicksort(int[] arr, int start, int end) {  //best is nlogn , average is nlogn , worst n^2(already sorted)
		if(start ==end) {
			return;
		}
		
		int t = pivot(arr,start,end);
		
		quicksort(arr, start, t-1);
		quicksort(arr, t+1, end);
	}

	public static void main(String[] args) {
		int[] arr = { 14, 6, 9, 24, 7 };
		int end = arr.length - 1;
		quicksort(arr,0,end);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
