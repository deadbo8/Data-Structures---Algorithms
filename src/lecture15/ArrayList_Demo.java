package lecture15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Demo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<Integer> l = new ArrayList<>();

		// add
		l.add(10);
		l.add(20);
		l.add(30); // O(1)

		System.out.println(l);

		l.add(1, 9); // O(n)
		System.out.println(l);

		// get
		System.out.println(l.get(2)); // O(1)

		// size
		System.out.println(l.size());

		// remove
		System.out.println(l.remove(1));
		System.out.println(l);

		// upadte
		l.set(1, -11); /// O(1)
		System.out.println(l);
		
		//sort
		Collections.sort(l);
		System.out.println(l); // O(Nlog(N))
		
		//reverse
		Collections.reverse(l);
		System.out.println(l);
		
		s.close();
	}
}
