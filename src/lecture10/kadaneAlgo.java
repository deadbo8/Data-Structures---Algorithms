package lecture10;

public class kadaneAlgo {

	public static int maximumSum(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {		
			sum += nums[i];
			max = Math.max(sum, max);
			if(sum<0) {
				sum=0;
			}

		}
		return max;

	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maximumSum(arr));

	}

}
