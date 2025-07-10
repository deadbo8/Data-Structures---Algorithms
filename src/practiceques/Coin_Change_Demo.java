package practiceques;

public class Coin_Change_Demo {
	
	
	public static void combinations(int[] arr, int target, String s) {
		if(target==0) {
			System.out.println(s);
			return;
		}
		if(target<0) {
			return;
		}
		
		for(int i=0; i<arr.length;i++) {
			combinations(arr, target-arr[i],s+arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 5};
		int target=8;
		String s ="";
		
		combinations(arr, target, s);
	}
}
