package mn223dn_assign1;

import java.util.Scanner;

public class Time {
	public static void main(String[] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Give a number of seconds: ");
		
		int input=sc.nextInt();
		
		int hours = ( input / 3600) % 3600 ;
		int minutes = ( input / 60) % 60;
		int seconds = ( input % 3600) % 60;
	    
		System.out.println("This corresponds to: "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds.");
		sc.close();
	}
}