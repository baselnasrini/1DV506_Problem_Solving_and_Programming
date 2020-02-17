package mn223dn_assign1;

import java.util.Scanner;

   public class BMI {
	   public static void main(String[] args){
		  
		   Scanner sc=new Scanner (System.in);
		   
		   System.out.print("Give your length in meter: ");
		   double l= sc.nextDouble();
		   
		   System.out.print("Give your weight in meter: ");
		   double w=sc.nextDouble();
		         	   
		   System.out.print("Your BMI: "+ Math.round(w/(l*l)) );
		   
		   
		   sc.close();
	   }

}
