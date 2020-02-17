package mn223dn_assign2;

import java.util.Scanner;

public class CountA {
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Provide a line of text: ");
	String input = sc.nextLine();
	
	int counta=0;
	int countA=0;
	for (int i=0; i<=input.length()-1; i++)
	{ char chara =input.charAt(i);
	
		if (chara=='a')
		{	
		counta++;		
		}
		else if (chara=='A')
		{
		countA++;
		}	
	}
	
	System.out.println ( "Number of 'a': " + counta );
	System.out.print("Number of 'A': " + countA);
	sc.close();
	
	}
}
