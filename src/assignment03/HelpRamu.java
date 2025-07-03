package assignment03;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T-- > 0) {
			int[] costTickets = new int[4];

			for (int i = 0; i < 4; i++) {
				costTickets[i] = s.nextInt();
			}

			int[] rikshawAndCabs = new int[2];

			for (int i = 0; i < 2; i++) {
				rikshawAndCabs[i] = s.nextInt();
			}

			int[] rikshaw = new int[rikshawAndCabs[0]];
			for (int i = 0; i < rikshawAndCabs[0]; i++) {
				rikshaw[i] = s.nextInt();
			}
			int[] cabs = new int[rikshawAndCabs[1]];
			for (int i = 0; i < rikshawAndCabs[1]; i++) {
				cabs[i] = s.nextInt();
			}

			int costofrickshaw = 0;
			int costofcabs = 0;

			for (int i = 0; i < rikshaw.length; i++) {
				costofrickshaw += Math.min(rikshaw[i] * costTickets[0], costTickets[1]);
			}
			costofrickshaw = Math.min(costofrickshaw, costTickets[2]);

			for (int i = 0; i < cabs.length; i++) {
				costofcabs += Math.min(cabs[i] * costTickets[0], costTickets[1]);
			}
			costofcabs = Math.min(costofcabs, costTickets[2]);

			int finalcost = Math.min(costofrickshaw + costofcabs, costTickets[3]);

			System.out.println(finalcost);
			
		}
		s.close();

	}

}
