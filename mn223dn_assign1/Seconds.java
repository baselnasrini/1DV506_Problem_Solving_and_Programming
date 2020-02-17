package mn223dn_assign1;

import java.util.Scanner;

public class Seconds {
   public static void main(String[] args){
	   
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.print("Hours:");
	   int h=sc.nextInt();
	   
	   System.out.print("Minutes:");
	   int m=sc.nextInt();
	   
	   System.out.print("Seconds:");
	   int s=sc.nextInt();
	   
	   int t=(h*3600)+(m*60)+s;
	   
	   System.out.print("Total time measured in seconds:"+t);	   
	   
	   
	   sc.close();
   }
}
