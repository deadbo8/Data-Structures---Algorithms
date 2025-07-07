package lecture15;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Demo_2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();  //default capacity is 10, paranthesis number can manually override the defualt capacity
		
		list.add(10);  // O(1)
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		
		System.out.println(list.size());
		list.add(20);   // cretates a new array of size 1.5X of the original array, vector has all the same function but grows by a multiplier by 2 k
		
		System.out.println(list.size());
		
		s.close();
	}
}
