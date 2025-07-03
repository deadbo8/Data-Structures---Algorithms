package leetcode;

public class RainWaterTrapping {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int l =0 , r =arr.length-1 , lMax=0, rMax =0;
		int water =0;
		
		while(l<r) {
			if(arr[l]<arr[r]) {
				if(arr[l]>=lMax) {
					lMax=arr[l];
				}else {
					water+=lMax-arr[l];
					
				}
				l++;
				
			}else {
				if(arr[r]>=rMax) {
					rMax=arr[r];
				}else {
					water+=rMax-arr[r];
				}
				r--;
			}
			
			
		}
		System.out.println(water);
	}

}
