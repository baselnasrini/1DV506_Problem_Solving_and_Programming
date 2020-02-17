package mn223dn_assign4;

import java.text.DecimalFormat;
import java.util.*;

public class DrunkenWalk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		System.out.print("Enter the number of steps: ");
		int step = sc.nextInt();

		System.out.print("Enter the number of walks: ");
		int walk = sc.nextInt();

		int fallCount = 0;
		for (int i = 0; i <= walk; i++) {

			RandomWalk ra = new RandomWalk(step, size);
			ra.walk();

			if (ra.inBound() == false) {
				fallCount++;
			}
		}
		double a = 100 * fallCount;
		DecimalFormat b = new DecimalFormat("0.##");

		System.out.print("Out of " + walk + " drunk prople, " + fallCount + " (" + b.format(a / walk)
				+ "%)  fell into the water.");

		sc.close();
	}
}