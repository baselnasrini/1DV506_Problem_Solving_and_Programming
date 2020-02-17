package mn223dn_assign1;

import java.util.Scanner;

public class change {
	public static void main(String[] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Price: ");
		double price=sc.nextDouble();
		
		System.out.print("Payment: ");
		double payment = sc.nextDouble();
		
		int change = (int) Math.round(payment - price) ;
		System.out.println("Change: " + change );
		
		int bills1000 = change / 1000;
		System.out.println("1000kr bills: " + bills1000 );
		
		int bills500 = (change - bills1000 * 1000 ) / 500 ; 
		System.out.println("500kr bills: " + bills500 );

		int bills100 = (change - (bills1000 * 1000 + bills500 * 500)) / 100 ;
		System.out.println("100kr bills: " + bills100 );
		
		int bills50 =  (change - (bills1000 * 1000 + bills500 * 500 + bills100 * 100)) / 50 ; 
		System.out.println("50kr bills: " + bills50 );

		int bills20 = (change - (bills1000 * 1000 + bills500 * 500 + bills100 *100 + bills50 * 50)) / 20 ;
		System.out.println("20kr bills: " + bills20 );

		int coins10 = (change - (bills1000 * 1000 + bills500 * 500 + bills100 *100 + bills50 * 50 + bills20*20)) / 10 ;
		System.out.println("10kr coins: " + coins10 );

		int coins5 = (change - (bills1000 * 1000 + bills500 * 500 + bills100 *100 + bills50 * 50 + bills20*20 + coins10*10)) / 5 ;
		System.out.println("5kr coins: " + coins5 );

		int coins1 = (change - (bills1000 * 1000 + bills500 * 500 + bills100 *100 + bills50 * 50+ bills20*20 + coins10*10 + coins5*5)) / 1 ;
		System.out.println("1kr coins: " + coins1 );
		
		
		sc.close();
	}
}