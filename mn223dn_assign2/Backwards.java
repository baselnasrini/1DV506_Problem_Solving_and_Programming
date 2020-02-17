package mn223dn_assign2;

import java.util.Scanner;

public class Backwards {
	public static void main(String[] args){

	Scanner sc= new Scanner(System.in);
	
	System.out.print("Provide a line of text: ");
	String input= sc.nextLine();
	
	
		for (int i=input.length()-1; i>=0; i--)
		{
			
		System.out.print(input.charAt(i));
		}
		
	sc.close();
		
	}
}