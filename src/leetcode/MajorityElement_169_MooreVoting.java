package leetcode;

public class MajorityElement_169_MooreVoting {
	
	public static int majorityElement(int[] nums) {
		int element = nums[0];
		int vote=1;
		for(int i =1; i<nums.length; i++) {
			if(nums[i]==element) {
				vote++;
			}else {
				vote--;
				if(vote == 0) {
					element = nums[i];
					vote=1;
				}
			}
		}
		return element;
	}

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		
		 System.out.println(majorityElement(nums));

	}

}
