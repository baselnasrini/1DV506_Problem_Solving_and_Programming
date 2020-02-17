package mn223dn_assign1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("X1= ");
		double x1 = input.nextDouble();
		
		System.out.print("Y1= ");
		double y1 = input.nextDouble();
		
		System.out.print("X2= ");
		double x2 = input.nextDouble();

		System.out.print("Y2= ");
		double y2 = input.nextDouble();
		
		double x = x1-x2;
		x = Math.pow(x,2);
		
		double y = y1-y2;
		y = Math.pow(y,2);
		
		double distance= Math.sqrt(x + y );

		DecimalFormat dFormat = new DecimalFormat ("0.###");
		String distanceDecimalFormat = dFormat.format(distance);
								
		System.out.print("Distance: "+distanceDecimalFormat);
		
		input.close();
	}
}