package assignment03;

import java.util.Scanner;

public class SeverityLevelsInHospital {
	public static void sortColors(int[] nums) {
		int n =nums.length;
		int low=0, mid=0, high=n-1;
		
		while(low<=high) {
			if(nums[mid]==0) {
				int temp = nums[low];
				nums[low]=nums[mid];
				nums[mid]=temp;
				low++;
				mid++;
			}else if(nums[mid]==1) {
				mid++;
			}else {
				int temp = nums[high];
				nums[high]=nums[mid];
				nums[mid]=temp;
				high--;
			}
		}

	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		sortColors(arr);
		for(int val:arr) {
			System.out.println(val);
		}

		s.close();
	}
}
