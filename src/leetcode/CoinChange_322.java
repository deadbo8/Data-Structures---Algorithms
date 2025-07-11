package leetcode;

import java.util.*;

public class CoinChange_322 {
	
	static int min =Integer.MAX_VALUE;
	
	public static void minCoins(int[] arr, int target, int count,int pos, List<Integer> list) {
		if(target==0) {
			System.out.println(list);
			min = Math.min(min, count);
			return;
		}
		if(target<0) {
			return;
		}
		
		for(int i=pos; i<arr.length;i++) {
			list.add(arr[i]);
			minCoins(arr, target-arr[i],count+1,i,list);
			list.remove(list.size()-1);   // Backtracking
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 5};
		int target=7;
		
		List<Integer> list = new ArrayList<>();
		
		minCoins(arr, target, 0,0,list);
		System.out.println(min);
	}
}