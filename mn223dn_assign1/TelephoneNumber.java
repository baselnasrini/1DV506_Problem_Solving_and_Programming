package mn223dn_assign1;

import java.util.Random;

public class TelephoneNumber {

	public static void main(String[] args){
	    Random number = new Random();
	    
		int xa = number.nextInt(10);
		int xb = number.nextInt(10);
		int xc = number.nextInt(10);
		
		int z = 1+number.nextInt(9);
		
		int ya = number.nextInt(10);
		int yb = number.nextInt(10);
		int yc = number.nextInt(10);
		int yd = number.nextInt(10);
		int ye = number.nextInt(10);
		
		System.out.print("0"+xa+xb+xc+"-"+z+ya+yb+yc+yd+ye+".");
		
	}
}