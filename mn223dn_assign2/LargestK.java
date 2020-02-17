package mn223dn_assign2;

import java.util.Scanner;

public class LargestK {

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Give a positive integer: ");
		
		int input= sc.nextInt();
		
		int sum = 0;
		int k = 0;		
			
			while (sum<input)		
			
			{
			k += 2;	
			sum=sum+k;	
			}
			
			System.out.print("The largest K such that 0+2+4+6+...+K<"+ input + " => K = " + (k-2));		
			
		sc.close();	
	}
}

