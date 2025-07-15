package leetcode;

public class Koko_Eating_banas_875 {

	public static int minPerHour(int[] bananas, int hours) {
		int l = 1;
		int h = 1000000000;

		while (l <= h) {
			int mid = l + (h - l) / 2;
			int k = 0;

			for (int i = 0; i < bananas.length; i++) {

				k += Math.ceil((double) bananas[i] / mid);

			}

			if (k <= hours) {
				h = mid -1 ;
			} else {
				l = mid+1;
			}

		}

		return l;

	}

	public static void main(String[] args) {
		int[] bananas = { 3, 6, 7, 11 };
		int hours = 8;
		int min = minPerHour(bananas, hours);

		System.out.println(min);
	}

	// brute force approach

//	public boolean check(int k, int h, int[] bananas) {
//		int ans =0; 
//		for(int i =0; i<bananas.length;i++) {
//			ans+=Math.ceil((1.0*bananas[i])/k);
//		}
//		return ans<=h;
//	}
//	
//	public int minEatingSpeed(int[] bananas, int h) {
//		for(int k =1; k<=1000000000;k++) {
//			if(check(k,h, bananas)) {
//				return k;
//			}
//			
//		}
//		return -1;
//	}
}
