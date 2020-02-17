package mn223dn_assign1;

import java.util.Scanner;

public class windChill {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Temperature (°C): ");
		double temp = input.nextDouble();
		
		
		System.out.print("Wind Speed (m/s): ");
		double wind = input.nextDouble();
		
		double windSqrt = Math.sqrt(wind);
		
		
		double windChillTemp  = 33+(temp-33)*(0.474+0.454*windSqrt-0.0454*wind);
		
		
		System.out.print("Wind Chill Temperature: " + windChillTemp );
	
		input.close();
	}

}
