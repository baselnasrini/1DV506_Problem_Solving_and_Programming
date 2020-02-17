package mn223dn_assign2;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Provide an odd integer: ");
		int in = input.nextInt();
		
		while ( in%2 == 0 || in < 0)
		{
			System.out.println("The provided integer must be a positive odd!");
			System.out.print("Provide a positive odd integer: ");
			in = input.nextInt();
		}
		
		
		int l=0;
		int space=0;
		int stars=0;	
		
		
		// right-angled triangle
		for ( l=0; l<in; l++)
		{		
			for (space=0; space<(in-1)-l ; space++)
			{
			System.out.print(" ");
			}
	
			for (stars=0; stars<l+1 ; stars++)
			{
			System.out.print("*");	
			}					
		System.out.println();	
		}
		
		//isosceles Triangle	
		int b = (in+1)/2;
		
		for ( l=0; l<b; l++)
		{		
			for (space=0; space<=in-b-l-1 ; space++)
			{
			System.out.print(" ");	
			}		
				
			for (stars=0; stars<=2*l; stars++)
			{
			System.out.print("*");	
			}
		System.out.println();		
		}		
		
	input.close();	
	}
}
