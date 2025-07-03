package leetcode;

import java.util.Arrays;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String s = "     the           sky    is   blue   ";
		
		s=s.trim();
		
		String[] arr = s.split(" +"); // similar to * and + from TOC
		System.out.println(Arrays.toString(arr));
		
		String ans="";
		for(int i =arr.length-1;i>=0;i--) {
			ans = ans+ arr[i]+" ";
		}
		
		ans=ans.trim();
		System.out.println(ans);
		
	}
}
