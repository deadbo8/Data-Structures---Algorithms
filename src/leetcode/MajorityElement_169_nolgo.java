package leetcode;

public class MajorityElement_169_nolgo {
	
	public static int majorityElement(int[] nums) {
        int appearance = nums.length/2;
        int majority=0;
        for(int i =0; i<nums.length;i++){
            int count=1;
                for(int j = i+1; j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;       
                    }
                }
                if(count>appearance){
                    majority=nums[i];
                }

        }
        return majority;
    }

	public static void main(String[] args) {

			int[] nums = {2,2,1,1,1,2,2};
			
		 System.out.println(majorityElement(nums));
			
			

	}

}
